/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;
import javax.persistence.*;
/**
 *
 * @author genar
 */
public class ControlAcceso {
    static EntityManagerFactory factory = Persistence.createEntityManagerFactory("GestionMakroPU");
    static EntityManager em = factory.createEntityManager();
    private static ControlAcceso ca=null;
    private ControlAcceso(){}
    private Empleado empleadoActual;
    public static ControlAcceso obtenerInstancia(){
        if(ca == null){
            ca = new ControlAcceso();
        }
        return ca;
    }
    public Empleado obtenerEmpleado(String login, String pass){
        Empleado empVer=null;
        try{
            Empleado emp = (Empleado) em.createNamedQuery("Empleado.findByLogin").setParameter("login", login).getSingleResult();
            if(emp.getContrasena().equals(pass)){
                empVer = emp;
            }
        }finally{
            return empVer;
        }
    }
    public void setEmpleadoActual(Empleado emp){this.empleadoActual = emp;}
    public Empleado obtenerEmpleadoActual(){return empleadoActual;}
}
