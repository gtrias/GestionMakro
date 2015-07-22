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
public class BloqueoTest {

    public BloqueoTest() {
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
     * Test of getTipo method, of class Bloqueo.
     */
    @Test
    public void getTipo() {
        System.out.println("getTipo");
        Bloqueo instance = new Bloqueo();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Bloqueo.
     */
    @Test
    public void setTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Bloqueo instance = new Bloqueo();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Bloqueo.
     */
    @Test
    public void getDescripcion() {
        System.out.println("getDescripcion");
        Bloqueo instance = new Bloqueo();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Bloqueo.
     */
    @Test
    public void setDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Bloqueo instance = new Bloqueo();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClienteCollection method, of class Bloqueo.
     */
    @Test
    public void getClienteCollection() {
        System.out.println("getClienteCollection");
        Bloqueo instance = new Bloqueo();
        Collection<Cliente> expResult = null;
        Collection<Cliente> result = instance.getClienteCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClienteCollection method, of class Bloqueo.
     */
    @Test
    public void setClienteCollection() {
        System.out.println("setClienteCollection");
        Collection<Cliente> clienteCollection = null;
        Bloqueo instance = new Bloqueo();
        instance.setClienteCollection(clienteCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}