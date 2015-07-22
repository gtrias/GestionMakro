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
public class LineaVentaPKTest {

    public LineaVentaPKTest() {
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
     * Test of getCodVenta method, of class LineaVentaPK.
     */
    @Test
    public void getCodVenta() {
        System.out.println("getCodVenta");
        LineaVentaPK instance = new LineaVentaPK();
        String expResult = "";
        String result = instance.getCodVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodVenta method, of class LineaVentaPK.
     */
    @Test
    public void setCodVenta() {
        System.out.println("setCodVenta");
        String codVenta = "";
        LineaVentaPK instance = new LineaVentaPK();
        instance.setCodVenta(codVenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodArticulo method, of class LineaVentaPK.
     */
    @Test
    public void getCodArticulo() {
        System.out.println("getCodArticulo");
        LineaVentaPK instance = new LineaVentaPK();
        String expResult = "";
        String result = instance.getCodArticulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodArticulo method, of class LineaVentaPK.
     */
    @Test
    public void setCodArticulo() {
        System.out.println("setCodArticulo");
        String codArticulo = "";
        LineaVentaPK instance = new LineaVentaPK();
        instance.setCodArticulo(codArticulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 

}