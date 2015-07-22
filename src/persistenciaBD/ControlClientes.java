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
public class ControlClientes {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("GestionMakroPU");
    EntityManager em = factory.createEntityManager();
    static ControlClientes c=null; 
    private ControlClientes(){}
    
    public static ControlClientes obtenerInstancia(){
        if(c == null){
            c = new ControlClientes();
        }
        return c;
    }

    public Cliente obtenerCliente(String cod){    
        Cliente cli=null;
        try{
            cli = (Cliente) em.createNamedQuery("Cliente.findByCodCliente").setParameter("codCliente", cod).getSingleResult();
        }catch(Exception e){
            System.out.println("Error a la hora de obtener un cliente");
        }
        return cli;
        
    }
    
    public List obtenerTodosLosClientes(){    
        List cli=null;
        try{
            cli = (List) em.createQuery("SELECT c FROM Cliente c").getResultList();
        }catch(Exception e){
            System.out.println("Error a la hora de obtener un cliente");
        }
        return cli;
        
    }
    
    public TiposCliente obtenerTipoCliente(String cod){
        TiposCliente tc=null;
        try{
            tc = (TiposCliente) em.createNamedQuery("TiposCliente.findByCodTipo").setParameter("codTipo", cod).getSingleResult();
        }catch(Exception e){
            System.out.println("No se ha encontrado el tipo de cliente solicitado");
            e.printStackTrace();
        }
        return tc;
    }
    
    public Actividades obtenerActividad(String codActividad){
        Actividades act=null;
        try{
            act = (Actividades) em.createNamedQuery("Actividades.findByCodActividad").setParameter("codActividad", codActividad).getSingleResult();
        }catch(Exception e){
            System.out.println("Ha ocurrido un error al obtener la actividad");
            e.printStackTrace();
        }
        return act;        
    }
    
    public Iterator obtenerCompradores(Cliente cli){
        Iterator compCol=null;
        try{
            compCol = cli.getCompradorCollection().iterator();
        }catch(Exception e){
            System.out.println("Error a la hora de obtener los compradores");
        }
        return compCol;
    }
    
    public Comprador obtenerComprador(int pos,Cliente cli){        
        Iterator compCol = obtenerCompradores(cli);
        Comprador compTmp=null;
        for(int i = 0; i < pos; i++){
            compTmp = (Comprador) compCol.next();
        }
        return compTmp;
    }
    
    public String obtenerMensajeBloqueo(Cliente cli){
        String resultado = cli.getMensajeBloque();
        return resultado;
    }
    
    public List obtenerListaBloqueos(){
        List bloqueos = em.createQuery("SELECT b FROM Bloqueo b").getResultList();
        return bloqueos;
    }
    
    public String obtenerCodBloqueo(Cliente cli){
        String resultado;
        resultado = cli.getCodBloqueo().getTipo();
        return resultado;
    }
    
    public String obtenerCodigoClienteLibre(){
        List clientes = obtenerTodosLosClientes();
        int i = clientes.size();
        i++;
        String s = String.valueOf(i);
        return s;
    }
    
    public Boolean nuevoCliente(String nombre, String nif, String direccion, String cp, String codTipo, Boolean recargo, String codActividad){
        Cliente cli = new Cliente(obtenerCodigoClienteLibre(), nif, nombre, recargo, obtenerFecha(), direccion, cp);    
        TiposCliente tc = obtenerTipoCliente(codTipo);
        cli.setCodTipo(tc);
        Actividades act = obtenerActividad(codActividad);
        cli.setCodActividad(act);
        return anadirCliente(cli);
    }
     
    public Date obtenerFecha(){
        Date fecha = new Date();
        return fecha;
    }
    
    public boolean anadirCliente(Cliente c){
        try{
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            return true;
        }catch(Exception e){
            System.out.println("Error al insertar un cliente");
            e.printStackTrace();
            return false;
        }finally {
           /** em.close();**/
        }
        
    }
    
    public boolean borrarCliente(Cliente c) {
        try{
            em.getTransaction().begin();
            Cliente cx = em.find(Cliente.class, c.getNif());
            em.remove(cx);
            em.getTransaction().commit();
        } finally {
            /**em.close();**/
            return false;
        }
    }
     
    public boolean actualizarCliente(Cliente c) {
        try{
            em.getTransaction().begin();
            Cliente cx = em.find(Cliente.class, c.getNif());
            cx.setCodActividad(c.getCodActividad()); 
            cx.setCodBloqueo(c.getCodBloqueo());
            cx.setCodCliente(c.getCodCliente());
            cx.setCodTipo(c.getCodTipo());
            cx.setCodigoPostal(c.getCodigoPostal());
            cx.setCompradorCollection(c.getCompradorCollection());
            cx.setContactoCollection(c.getContactoCollection());
            cx.setDireccion(c.getDireccion());
            cx.setMensajeBloque(c.getMensajeBloque());
            cx.setNif(c.getNif());
            cx.setNombre(c.getNombre());
            cx.setRecargo(c.getRecargo());
            cx.setReservaCollection(c.getReservaCollection());
            em.getTransaction().commit();
        } finally {
            /**em.close();**/
            return false;
        }
    }
}
