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
public class ControlArticulos {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("GestionMakroPU");
    EntityManager em = factory.createEntityManager();
    static ControlArticulos ca = null;
    private ControlArticulos(){}
    
    public static ControlArticulos obtenerInstancia(){
        if(ca == null){
            ca = new ControlArticulos();
        }
        return ca;
    }
    public Articulo obtenerArticulo(String cod){    
        Articulo art=null;
        try{
            art = (Articulo) em.createNamedQuery("Articulo.findByCodArticulo").setParameter("codArticulo", cod).getSingleResult();
        }catch(Exception e){
            System.out.println("Error a la hora de obtener un articulo");
            e.printStackTrace();
        }
        return art;
    }
    
      public List obtenerTodosLosArticulos(){    
        List articulos=null;
        try{
            articulos = (List) em.createQuery("SELECT a FROM Articulo a").getResultList();
        }catch(Exception e){
            System.out.println("Error a la hora de obtener los articulos");
        }
        return articulos;
    }
    
    public String obtenerCodigoArticuloLibre(){
        List articulos = (List) obtenerTodosLosArticulos();
        int i=0;
        i = articulos.size();
        i++;
        String s = String.valueOf(i);
        return s;
    }
    
    public void decrementarStock(Articulo art, int cantidad){
       art.setExistencias(art.getExistencias()-cantidad);
       actualizarArticulo(art);
    }
    public boolean actualizarArticulo(Articulo art) {
        try{
            em.getTransaction().begin();
            Articulo ar = em.find(Articulo.class, art.getCodArticulo());
            ar.setCodArticulo(art.getCodArticulo());
            ar.setCodProveedor(art.getCodProveedor());
            ar.setDescripcion(art.getDescripcion());
            ar.setExistenciaMinima(art.getExistenciaMinima());
            ar.setExistencias(art.getExistencias());
            ar.setIva(art.getIva());
            ar.setLineaPedidoCollection(art.getLineaPedidoCollection());
            ar.setLineaReservaCollection(art.getLineaReservaCollection());
            ar.setLineaVentaCollection(art.getLineaVentaCollection());
            ar.setMediaVentasSemanal(art.getMediaVentasSemanal());
            ar.setNombre(art.getNombre());
            ar.setNumRevisiones(art.getNumRevisiones());
            ar.setPrecio(art.getPrecio());
            ar.setRecargoEquivalencia(art.getRecargoEquivalencia());
            ar.setTotalVentas(art.getTotalVentas());
            ar.setVentasSemana(art.getVentasSemana());
            em.getTransaction().commit();
        } finally {
            /**em.close();**/
            return false;
        }
    }
}
