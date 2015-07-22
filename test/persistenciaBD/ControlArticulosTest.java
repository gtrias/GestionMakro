/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;

import java.util.List;
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
public class ControlArticulosTest {

    public ControlArticulosTest() {
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
     * Test of obtenerInstancia method, of class ControlArticulos.
     */
    @Test
    public void obtenerInstancia() {
        System.out.println("obtenerInstancia");
        ControlArticulos expResult = null;
        ControlArticulos result = ControlArticulos.obtenerInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerArticulo method, of class ControlArticulos.
     */
    @Test
    public void obtenerArticulo() {
        System.out.println("obtenerArticulo");
        String cod = "";
        ControlArticulos instance = null;
        Articulo expResult = null;
        Articulo result = instance.obtenerArticulo(cod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTodosLosArticulos method, of class ControlArticulos.
     */
    @Test
    public void obtenerTodosLosArticulos() {
        System.out.println("obtenerTodosLosArticulos");
        ControlArticulos instance = null;
        List expResult = null;
        List result = instance.obtenerTodosLosArticulos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCodigoArticuloLibre method, of class ControlArticulos.
     */
    @Test
    public void obtenerCodigoArticuloLibre() {
        System.out.println("obtenerCodigoArticuloLibre");
        ControlArticulos instance = null;
        String expResult = "";
        String result = instance.obtenerCodigoArticuloLibre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrementarStock method, of class ControlArticulos.
     */
    @Test
    public void decrementarStock() {
        System.out.println("decrementarStock");
        Articulo art = null;
        int cantidad = 0;
        ControlArticulos instance = null;
        instance.decrementarStock(art, cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarArticulo method, of class ControlArticulos.
     */
    @Test
    public void actualizarArticulo() {
        System.out.println("actualizarArticulo");
        Articulo art = null;
        ControlArticulos instance = null;
        boolean expResult = false;
        boolean result = instance.actualizarArticulo(art);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}