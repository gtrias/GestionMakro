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
public class ContactoPKTest {

    public ContactoPKTest() {
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
     * Test of getCodCliente method, of class ContactoPK.
     */
    @Test
    public void getCodCliente() {
        System.out.println("getCodCliente");
        ContactoPK instance = new ContactoPK();
        String expResult = "";
        String result = instance.getCodCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodCliente method, of class ContactoPK.
     */
    @Test
    public void setCodCliente() {
        System.out.println("setCodCliente");
        String codCliente = "";
        ContactoPK instance = new ContactoPK();
        instance.setCodCliente(codCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdContacto method, of class ContactoPK.
     */
    @Test
    public void getIdContacto() {
        System.out.println("getIdContacto");
        ContactoPK instance = new ContactoPK();
        String expResult = "";
        String result = instance.getIdContacto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdContacto method, of class ContactoPK.
     */
    @Test
    public void setIdContacto() {
        System.out.println("setIdContacto");
        String idContacto = "";
        ContactoPK instance = new ContactoPK();
        instance.setIdContacto(idContacto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class ContactoPK.
     */


}