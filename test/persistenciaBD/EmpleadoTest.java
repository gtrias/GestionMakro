/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;

import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author genar
 */
public class EmpleadoTest {

    public EmpleadoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCodEmpleado method, of class Empleado.
     */
    @Test
    public void getCodEmpleado() {
        System.out.println("getCodEmpleado");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getCodEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodEmpleado method, of class Empleado.
     */
    @Test
    public void setCodEmpleado() {
        System.out.println("setCodEmpleado");
        String codEmpleado = "";
        Empleado instance = new Empleado();
        instance.setCodEmpleado(codEmpleado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Empleado.
     */
    @Test
    public void getLogin() {
        System.out.println("getLogin");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Empleado.
     */
    @Test
    public void setLogin() {
        System.out.println("setLogin");
        String login = "";
        Empleado instance = new Empleado();
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContrasena method, of class Empleado.
     */
    @Test
    public void getContrasena() {
        System.out.println("getContrasena");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getContrasena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContrasena method, of class Empleado.
     */
    @Test
    public void setContrasena() {
        System.out.println("setContrasena");
        String contrasena = "";
        Empleado instance = new Empleado();
        instance.setContrasena(contrasena);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVentaCollection method, of class Empleado.
     */
    @Test
    public void getVentaCollection() {
        System.out.println("getVentaCollection");
        Empleado instance = new Empleado();
        Collection<Venta> expResult = null;
        Collection<Venta> result = instance.getVentaCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVentaCollection method, of class Empleado.
     */
    @Test
    public void setVentaCollection() {
        System.out.println("setVentaCollection");
        Collection<Venta> ventaCollection = null;
        Empleado instance = new Empleado();
        instance.setVentaCollection(ventaCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPedidoCollection method, of class Empleado.
     */
    @Test
    public void getPedidoCollection() {
        System.out.println("getPedidoCollection");
        Empleado instance = new Empleado();
        Collection<Pedido> expResult = null;
        Collection<Pedido> result = instance.getPedidoCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPedidoCollection method, of class Empleado.
     */
    @Test
    public void setPedidoCollection() {
        System.out.println("setPedidoCollection");
        Collection<Pedido> pedidoCollection = null;
        Empleado instance = new Empleado();
        instance.setPedidoCollection(pedidoCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReservaCollection method, of class Empleado.
     */
    @Test
    public void getReservaCollection() {
        System.out.println("getReservaCollection");
        Empleado instance = new Empleado();
        Collection<Reserva> expResult = null;
        Collection<Reserva> result = instance.getReservaCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReservaCollection method, of class Empleado.
     */
    @Test
    public void setReservaCollection() {
        System.out.println("setReservaCollection");
        Collection<Reserva> reservaCollection = null;
        Empleado instance = new Empleado();
        instance.setReservaCollection(reservaCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
}