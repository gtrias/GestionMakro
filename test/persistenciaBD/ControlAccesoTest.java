/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;

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
public class ControlAccesoTest {

    public ControlAccesoTest() {
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
     * Test of obtenerInstancia method, of class ControlAcceso.
     */
    @Test
    public void obtenerInstancia() {
        System.out.println("obtenerInstancia");
        ControlAcceso expResult = null;
        ControlAcceso result = ControlAcceso.obtenerInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerEmpleado method, of class ControlAcceso.
     */
    @Test
    public void obtenerEmpleado() {
        System.out.println("obtenerEmpleado");
        String login = "";
        String pass = "";
        ControlAcceso instance = null;
        Empleado expResult = null;
        Empleado result = instance.obtenerEmpleado(login, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpleadoActual method, of class ControlAcceso.
     */
    @Test
    public void setEmpleadoActual() {
        System.out.println("setEmpleadoActual");
        Empleado emp = null;
        ControlAcceso instance = null;
        instance.setEmpleadoActual(emp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerEmpleadoActual method, of class ControlAcceso.
     */
    @Test
    public void obtenerEmpleadoActual() {
        System.out.println("obtenerEmpleadoActual");
        ControlAcceso instance = null;
        Empleado expResult = null;
        Empleado result = instance.obtenerEmpleadoActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}