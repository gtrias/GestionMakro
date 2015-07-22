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
public class CompradorPKTest {

    public CompradorPKTest() {
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
     * Test of getCodCliente method, of class CompradorPK.
     */
    @Test
    public void getCodCliente() {
        System.out.println("getCodCliente");
        CompradorPK instance = new CompradorPK();
        String expResult = "";
        String result = instance.getCodCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodCliente method, of class CompradorPK.
     */
    @Test
    public void setCodCliente() {
        System.out.println("setCodCliente");
        String codCliente = "";
        CompradorPK instance = new CompradorPK();
        instance.setCodCliente(codCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdComprador method, of class CompradorPK.
     */
    @Test
    public void getIdComprador() {
        System.out.println("getIdComprador");
        CompradorPK instance = new CompradorPK();
        String expResult = "";
        String result = instance.getIdComprador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdComprador method, of class CompradorPK.
     */
    @Test
    public void setIdComprador() {
        System.out.println("setIdComprador");
        String idComprador = "";
        CompradorPK instance = new CompradorPK();
        instance.setIdComprador(idComprador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class CompradorPK.
     */
 

}