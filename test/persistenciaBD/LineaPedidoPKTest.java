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
public class LineaPedidoPKTest {

    public LineaPedidoPKTest() {
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
     * Test of getCodPedido method, of class LineaPedidoPK.
     */
    @Test
    public void getCodPedido() {
        System.out.println("getCodPedido");
        LineaPedidoPK instance = new LineaPedidoPK();
        String expResult = "";
        String result = instance.getCodPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodPedido method, of class LineaPedidoPK.
     */
    @Test
    public void setCodPedido() {
        System.out.println("setCodPedido");
        String codPedido = "";
        LineaPedidoPK instance = new LineaPedidoPK();
        instance.setCodPedido(codPedido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodArticulo method, of class LineaPedidoPK.
     */
    @Test
    public void getCodArticulo() {
        System.out.println("getCodArticulo");
        LineaPedidoPK instance = new LineaPedidoPK();
        String expResult = "";
        String result = instance.getCodArticulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodArticulo method, of class LineaPedidoPK.
     */
    @Test
    public void setCodArticulo() {
        System.out.println("setCodArticulo");
        String codArticulo = "";
        LineaPedidoPK instance = new LineaPedidoPK();
        instance.setCodArticulo(codArticulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  

}