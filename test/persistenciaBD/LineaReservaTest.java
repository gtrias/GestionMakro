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
public class LineaReservaTest {

    public LineaReservaTest() {
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
     * Test of getLineaReservaPK method, of class LineaReserva.
     */
    @Test
    public void getLineaReservaPK() {
        System.out.println("getLineaReservaPK");
        LineaReserva instance = new LineaReserva();
        LineaReservaPK expResult = null;
        LineaReservaPK result = instance.getLineaReservaPK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLineaReservaPK method, of class LineaReserva.
     */
    @Test
    public void setLineaReservaPK() {
        System.out.println("setLineaReservaPK");
        LineaReservaPK lineaReservaPK = null;
        LineaReserva instance = new LineaReserva();
        instance.setLineaReservaPK(lineaReservaPK);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class LineaReserva.
     */
    @Test
    public void getCantidad() {
        System.out.println("getCantidad");
        LineaReserva instance = new LineaReserva();
        long expResult = 0L;
        long result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class LineaReserva.
     */
    @Test
    public void setCantidad() {
        System.out.println("setCantidad");
        long cantidad = 0L;
        LineaReserva instance = new LineaReserva();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubTotal method, of class LineaReserva.
     */
    @Test
    public void getSubTotal() {
        System.out.println("getSubTotal");
        LineaReserva instance = new LineaReserva();
        Float expResult = null;
        Float result = instance.getSubTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubTotal method, of class LineaReserva.
     */
    @Test
    public void setSubTotal() {
        System.out.println("setSubTotal");
        Float subTotal = null;
        LineaReserva instance = new LineaReserva();
        instance.setSubTotal(subTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIva method, of class LineaReserva.
     */
    @Test
    public void getIva() {
        System.out.println("getIva");
        LineaReserva instance = new LineaReserva();
        float expResult = 0.0F;
        float result = instance.getIva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIva method, of class LineaReserva.
     */
    @Test
    public void setIva() {
        System.out.println("setIva");
        float iva = 0.0F;
        LineaReserva instance = new LineaReserva();
        instance.setIva(iva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecargo method, of class LineaReserva.
     */
    @Test
    public void getRecargo() {
        System.out.println("getRecargo");
        LineaReserva instance = new LineaReserva();
        float expResult = 0.0F;
        float result = instance.getRecargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecargo method, of class LineaReserva.
     */
    @Test
    public void setRecargo() {
        System.out.println("setRecargo");
        float recargo = 0.0F;
        LineaReserva instance = new LineaReserva();
        instance.setRecargo(recargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArticulo method, of class LineaReserva.
     */
    @Test
    public void getArticulo() {
        System.out.println("getArticulo");
        LineaReserva instance = new LineaReserva();
        Articulo expResult = null;
        Articulo result = instance.getArticulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArticulo method, of class LineaReserva.
     */
    @Test
    public void setArticulo() {
        System.out.println("setArticulo");
        Articulo articulo = null;
        LineaReserva instance = new LineaReserva();
        instance.setArticulo(articulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReserva method, of class LineaReserva.
     */
    @Test
    public void getReserva() {
        System.out.println("getReserva");
        LineaReserva instance = new LineaReserva();
        Reserva expResult = null;
        Reserva result = instance.getReserva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReserva method, of class LineaReserva.
     */
    @Test
    public void setReserva() {
        System.out.println("setReserva");
        Reserva reserva = null;
        LineaReserva instance = new LineaReserva();
        instance.setReserva(reserva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }



}