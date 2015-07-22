/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;
import javax.persistence.*;
import java.util.*;
/**
 *
 * @author genar
 */
public class ControlVenta {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("GestionMakroPU");
    EntityManager em = factory.createEntityManager();
    static ControlVenta cv = null;
    private ControlVenta(){}
    
    public static ControlVenta obtenerInstancia(){
        if(cv == null){
            cv = new ControlVenta();
        }
        return cv;
    }
    
    public void empezarTransaccion(){
        em.getTransaction().begin();
    }
    
    public void terminarTransaccion(){
        em.getTransaction().commit();
    }
    
    public void deshacerTransaccion(){
        em.getTransaction().rollback();
    }
    
    public List obtenerTodasLasVentas(){    
        List ventas=null;
        try{
            /** ventas = (List) em.createNativeQuery("SELECT * FROM articulo").getResultList();**/
            ventas = (List) em.createQuery("SELECT a FROM Venta a").getResultList();
        }catch(Exception e){
            System.out.println("Error a la hora de obtener las ventas");
        }
        return ventas;
    }
    
    public String obtenerCodigoVentaLibre(){
        List ventas = (List) obtenerTodasLasVentas();
        int i=0;
        i = ventas.size();
        i++;
        String s = String.valueOf(i);
        return s;
    }
    
    public Venta empezarVenta(String codCliente){
        Venta venta = new Venta(obtenerCodigoVentaLibre());
        venta.setCodEmpleado(ControlAcceso.obtenerInstancia().obtenerEmpleadoActual());
        Cliente cliente = ControlClientes.obtenerInstancia().obtenerCliente(codCliente);
        venta.setCodCliente(cliente);
        venta.setFecha(obtenerFecha());
        empezarTransaccion();
        almacenarVenta(venta);
        return venta;
    }
    
    public Date obtenerFecha(){
        Date fecha = new Date();
        return fecha;
    }
    
    public boolean almacenarVenta(Venta v){
        try{
            em.persist(v);
            return true;
        }catch(Exception e){
            System.out.println("Error al crear la venta");
            e.printStackTrace();
            deshacerTransaccion();
            return false;
        }finally {
            /**em.close();**/
        }
    }
    
    public Venta obtenerVenta(String codVenta){
        Venta v  = null;
        try{
            v = (Venta)em.createNamedQuery("Venta.findByCodVenta").setParameter("codVenta", codVenta).getSingleResult();
        }catch(Exception e){
            deshacerTransaccion();
            e.printStackTrace();
        }
        return v;
    }
    
    public LineaVenta crearLineaVenta(String codVenta,String codArticulo, String cantidad){
        Articulo art = ControlArticulos.obtenerInstancia().obtenerArticulo(codArticulo);
        LineaVenta ltmp = new LineaVenta(codVenta,art.getCodArticulo());
        ltmp.setArticulo(art);
        ltmp.setRecargo(art.getRecargoEquivalencia());
        ltmp.setCantidad(Integer.valueOf(cantidad));
        Float total = Float.valueOf(cantidad) * art.getPrecio();
        ltmp.setSubTotal(total);
        return ltmp;
    }
    
    public boolean anadirLineaVenta(LineaVenta lv){
        lv.setIva(lv.getArticulo().getIva());
        lv.setRecargo(lv.getArticulo().getRecargoEquivalencia());
        Float subtotal = lv.getCantidad() * Float.valueOf(lv.getArticulo().getPrecio());
        lv.setSubTotal(subtotal);
         try{
            em.persist(lv);
            ControlArticulos.obtenerInstancia().decrementarStock(lv.getArticulo(), lv.getCantidad());
            return true;
        }catch(Exception e){
            System.out.println("Error al crear la linea de venta");
            e.printStackTrace();
            deshacerTransaccion();
            return false;
        }finally {
           /** em.close();**/
        }
        
    }
    
   public List obtenerLineasVenta(Venta v){    
        List lv=null;
        try{
            lv = (List) em.createNamedQuery("LineaVenta.findByCodVenta").setParameter("codVenta", v.getCodVenta()).getResultList();
        }catch(Exception e){
            System.out.println("Error a la hora de obtener un cliente");
        }
        return lv;
        
    }
    
    public Venta terminarVenta(Venta venta){
        Venta retorno=null;
        try{
            float total=0; 
            float recargo=0;
            float iva=0;
            List lista = (List) obtenerLineasVenta(venta);
            for(int i=0; i<lista.size(); i++){
                LineaVenta lv = (LineaVenta) lista.get(i);
                lv.setVenta(venta);
                actualizarLineaVenta(lv);
                total = total + lv.getSubTotal();
                recargo = recargo + (lv.getSubTotal() * (lv.getRecargo()/100));
                iva = iva + (lv.getSubTotal() * (lv.getIva()/100));
            }
            venta.setTotal(total);
            venta.setImporte(total + iva);
            venta.setIva(iva);
            venta.setRecargoEquivalencia(recargo);        
            retorno = actualizarVenta(venta);
        }catch(Exception e){
            deshacerTransaccion();
            e.printStackTrace();
        }
        return retorno;
        
    }
    
    
    public Venta actualizarVenta(Venta v) {
        Venta vx=null;
        try{
            vx = em.find(Venta.class, v.getCodVenta());
            vx.setCodEmpleado(v.getCodEmpleado());
            vx.setCodVenta(v.getCodVenta());
            vx.setFecha(v.getFecha());
            vx.setImporte(v.getImporte());
            vx.setIva(v.getIva());
            vx.setRecargoEquivalencia(v.getRecargoEquivalencia());
            vx.setTotal(v.getTotal());
            terminarTransaccion();
        }catch(Exception e){
            deshacerTransaccion();
            e.printStackTrace();
        }finally {
            /**em.close();**/
            return vx;
        }
    }
    public boolean actualizarLineaVenta(LineaVenta lv) {
        try{
            LineaVenta lvx = em.find(LineaVenta.class, lv.getLineaVentaPK());
            lvx.setArticulo(lv.getArticulo());
            lvx.setCantidad(lv.getCantidad());
            lvx.setIva(lv.getIva());
            lvx.setLineaVentaPK(lv.getLineaVentaPK());
            lvx.setRecargo(lv.getRecargo());
            lvx.setSubTotal(lv.getSubTotal());
            lvx.setVenta(lv.getVenta());
        }catch(Exception e){
            deshacerTransaccion();
            e.printStackTrace();
        }finally {
            /**em.close();**/
            return false;
        }
    }
}
