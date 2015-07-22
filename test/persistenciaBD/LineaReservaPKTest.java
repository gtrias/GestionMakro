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
public class LineaReservaPKTest {

    public LineaReservaPKTest() {
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
     * Test of getCodReserva method, of class LineaReservaPK.
     */
    @Test
    public void getCodReserva() {
        System.out.println("getCodReserva");
        LineaReservaPK instance = new LineaReservaPK();
        String expResult = "";
        String result = instance.getCodReserva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodReserva method, of class LineaReservaPK.
     */
    @Test
    public void setCodReserva() {
        System.out.println("setCodReserva");
        String codReserva = "";
        LineaReservaPK instance = new LineaReservaPK();
        instance.setCodReserva(codReserva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodArticulo method, of class LineaReservaPK.
     */
    @Test
    public void getCodArticulo() {
        System.out.println("getCodArticulo");
        LineaReservaPK instance = new LineaReservaPK();
        String expResult = "";
        String result = instance.getCodArticulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodArticulo method, of class LineaReservaPK.
     */
    @Test
    public void setCodArticulo() {
        System.out.println("setCodArticulo");
        String codArticulo = "";
        LineaReservaPK instance = new LineaReservaPK();
        instance.setCodArticulo(codArticulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   

}