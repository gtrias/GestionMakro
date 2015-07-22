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
public class LineaVentaTest {

    public LineaVentaTest() {
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
     * Test of getLineaVentaPK method, of class LineaVenta.
     */
    @Test
    public void getLineaVentaPK() {
        System.out.println("getLineaVentaPK");
        LineaVenta instance = new LineaVenta();
        LineaVentaPK expResult = null;
        LineaVentaPK result = instance.getLineaVentaPK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLineaVentaPK method, of class LineaVenta.
     */
    @Test
    public void setLineaVentaPK() {
        System.out.println("setLineaVentaPK");
        LineaVentaPK lineaVentaPK = null;
        LineaVenta instance = new LineaVenta();
        instance.setLineaVentaPK(lineaVentaPK);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class LineaVenta.
     */
    @Test
    public void getCantidad() {
        System.out.println("getCantidad");
        LineaVenta instance = new LineaVenta();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class LineaVenta.
     */
    @Test
    public void setCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        LineaVenta instance = new LineaVenta();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubTotal method, of class LineaVenta.
     */
    @Test
    public void getSubTotal() {
        System.out.println("getSubTotal");
        LineaVenta instance = new LineaVenta();
        Float expResult = null;
        Float result = instance.getSubTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubTotal method, of class LineaVenta.
     */
    @Test
    public void setSubTotal() {
        System.out.println("setSubTotal");
        Float subTotal = null;
        LineaVenta instance = new LineaVenta();
        instance.setSubTotal(subTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIva method, of class LineaVenta.
     */
    @Test
    public void getIva() {
        System.out.println("getIva");
        LineaVenta instance = new LineaVenta();
        float expResult = 0.0F;
        float result = instance.getIva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIva method, of class LineaVenta.
     */
    @Test
    public void setIva() {
        System.out.println("setIva");
        float iva = 0.0F;
        LineaVenta instance = new LineaVenta();
        instance.setIva(iva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecargo method, of class LineaVenta.
     */
    @Test
    public void getRecargo() {
        System.out.println("getRecargo");
        LineaVenta instance = new LineaVenta();
        float expResult = 0.0F;
        float result = instance.getRecargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecargo method, of class LineaVenta.
     */
    @Test
    public void setRecargo() {
        System.out.println("setRecargo");
        float recargo = 0.0F;
        LineaVenta instance = new LineaVenta();
        instance.setRecargo(recargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArticulo method, of class LineaVenta.
     */
    @Test
    public void getArticulo() {
        System.out.println("getArticulo");
        LineaVenta instance = new LineaVenta();
        Articulo expResult = null;
        Articulo result = instance.getArticulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArticulo method, of class LineaVenta.
     */
    @Test
    public void setArticulo() {
        System.out.println("setArticulo");
        Articulo articulo = null;
        LineaVenta instance = new LineaVenta();
        instance.setArticulo(articulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVenta method, of class LineaVenta.
     */
    @Test
    public void getVenta() {
        System.out.println("getVenta");
        LineaVenta instance = new LineaVenta();
        Venta expResult = null;
        Venta result = instance.getVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVenta method, of class LineaVenta.
     */
    @Test
    public void setVenta() {
        System.out.println("setVenta");
        Venta venta = null;
        LineaVenta instance = new LineaVenta();
        instance.setVenta(venta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }



}