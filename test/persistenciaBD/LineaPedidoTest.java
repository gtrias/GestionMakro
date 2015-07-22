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
public class LineaPedidoTest {

    public LineaPedidoTest() {
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
     * Test of getLineaPedidoPK method, of class LineaPedido.
     */
    @Test
    public void getLineaPedidoPK() {
        System.out.println("getLineaPedidoPK");
        LineaPedido instance = new LineaPedido();
        LineaPedidoPK expResult = null;
        LineaPedidoPK result = instance.getLineaPedidoPK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLineaPedidoPK method, of class LineaPedido.
     */
    @Test
    public void setLineaPedidoPK() {
        System.out.println("setLineaPedidoPK");
        LineaPedidoPK lineaPedidoPK = null;
        LineaPedido instance = new LineaPedido();
        instance.setLineaPedidoPK(lineaPedidoPK);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class LineaPedido.
     */
    @Test
    public void getCantidad() {
        System.out.println("getCantidad");
        LineaPedido instance = new LineaPedido();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class LineaPedido.
     */
    @Test
    public void setCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        LineaPedido instance = new LineaPedido();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArticulo method, of class LineaPedido.
     */
    @Test
    public void getArticulo() {
        System.out.println("getArticulo");
        LineaPedido instance = new LineaPedido();
        Articulo expResult = null;
        Articulo result = instance.getArticulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArticulo method, of class LineaPedido.
     */
    @Test
    public void setArticulo() {
        System.out.println("setArticulo");
        Articulo articulo = null;
        LineaPedido instance = new LineaPedido();
        instance.setArticulo(articulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPedido method, of class LineaPedido.
     */
    @Test
    public void getPedido() {
        System.out.println("getPedido");
        LineaPedido instance = new LineaPedido();
        Pedido expResult = null;
        Pedido result = instance.getPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPedido method, of class LineaPedido.
     */
    @Test
    public void setPedido() {
        System.out.println("setPedido");
        Pedido pedido = null;
        LineaPedido instance = new LineaPedido();
        instance.setPedido(pedido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 

}