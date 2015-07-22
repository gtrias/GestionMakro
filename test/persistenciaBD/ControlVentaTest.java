/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;

import java.util.Date;
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
public class ControlVentaTest {

    public ControlVentaTest() {
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
     * Test of obtenerInstancia method, of class ControlVenta.
     */
    @Test
    public void obtenerInstancia() {
        System.out.println("obtenerInstancia");
        ControlVenta expResult = null;
        ControlVenta result = ControlVenta.obtenerInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empezarTransaccion method, of class ControlVenta.
     */
    @Test
    public void empezarTransaccion() {
        System.out.println("empezarTransaccion");
        ControlVenta instance = null;
        instance.empezarTransaccion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of terminarTransaccion method, of class ControlVenta.
     */
    @Test
    public void terminarTransaccion() {
        System.out.println("terminarTransaccion");
        ControlVenta instance = null;
        instance.terminarTransaccion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deshacerTransaccion method, of class ControlVenta.
     */
    @Test
    public void deshacerTransaccion() {
        System.out.println("deshacerTransaccion");
        ControlVenta instance = null;
        instance.deshacerTransaccion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTodasLasVentas method, of class ControlVenta.
     */
    @Test
    public void obtenerTodasLasVentas() {
        System.out.println("obtenerTodasLasVentas");
        ControlVenta instance = null;
        List expResult = null;
        List result = instance.obtenerTodasLasVentas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCodigoVentaLibre method, of class ControlVenta.
     */
    @Test
    public void obtenerCodigoVentaLibre() {
        System.out.println("obtenerCodigoVentaLibre");
        ControlVenta instance = null;
        String expResult = "";
        String result = instance.obtenerCodigoVentaLibre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empezarVenta method, of class ControlVenta.
     */
    @Test
    public void empezarVenta() {
        System.out.println("empezarVenta");
        String codCliente = "";
        ControlVenta instance = null;
        Venta expResult = null;
        Venta result = instance.empezarVenta(codCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerFecha method, of class ControlVenta.
     */
    @Test
    public void obtenerFecha() {
        System.out.println("obtenerFecha");
        ControlVenta instance = null;
        Date expResult = null;
        Date result = instance.obtenerFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of almacenarVenta method, of class ControlVenta.
     */
    @Test
    public void almacenarVenta() {
        System.out.println("almacenarVenta");
        Venta v = null;
        ControlVenta instance = null;
        boolean expResult = false;
        boolean result = instance.almacenarVenta(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerVenta method, of class ControlVenta.
     */
    @Test
    public void obtenerVenta() {
        System.out.println("obtenerVenta");
        String codVenta = "";
        ControlVenta instance = null;
        Venta expResult = null;
        Venta result = instance.obtenerVenta(codVenta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearLineaVenta method, of class ControlVenta.
     */
    @Test
    public void crearLineaVenta() {
        System.out.println("crearLineaVenta");
        String codVenta = "";
        String codArticulo = "";
        String cantidad = "";
        ControlVenta instance = null;
        LineaVenta expResult = null;
        LineaVenta result = instance.crearLineaVenta(codVenta, codArticulo, cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anadirLineaVenta method, of class ControlVenta.
     */
    @Test
    public void anadirLineaVenta() {
        System.out.println("anadirLineaVenta");
        LineaVenta lv = null;
        ControlVenta instance = null;
        boolean expResult = false;
        boolean result = instance.anadirLineaVenta(lv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerLineasVenta method, of class ControlVenta.
     */
    @Test
    public void obtenerLineasVenta() {
        System.out.println("obtenerLineasVenta");
        Venta v = null;
        ControlVenta instance = null;
        List expResult = null;
        List result = instance.obtenerLineasVenta(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of terminarVenta method, of class ControlVenta.
     */
    @Test
    public void terminarVenta() {
        System.out.println("terminarVenta");
        Venta venta = null;
        ControlVenta instance = null;
        Venta expResult = null;
        Venta result = instance.terminarVenta(venta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarVenta method, of class ControlVenta.
     */
    @Test
    public void actualizarVenta() {
        System.out.println("actualizarVenta");
        Venta v = null;
        ControlVenta instance = null;
        Venta expResult = null;
        Venta result = instance.actualizarVenta(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarLineaVenta method, of class ControlVenta.
     */
    @Test
    public void actualizarLineaVenta() {
        System.out.println("actualizarLineaVenta");
        LineaVenta lv = null;
        ControlVenta instance = null;
        boolean expResult = false;
        boolean result = instance.actualizarLineaVenta(lv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}