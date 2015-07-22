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
public class ContactoTest {

    public ContactoTest() {
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
     * Test of getContactoPK method, of class Contacto.
     */
    @Test
    public void getContactoPK() {
        System.out.println("getContactoPK");
        Contacto instance = new Contacto();
        ContactoPK expResult = null;
        ContactoPK result = instance.getContactoPK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContactoPK method, of class Contacto.
     */
    @Test
    public void setContactoPK() {
        System.out.println("setContactoPK");
        ContactoPK contactoPK = null;
        Contacto instance = new Contacto();
        instance.setContactoPK(contactoPK);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Contacto.
     */
    @Test
    public void getTipo() {
        System.out.println("getTipo");
        Contacto instance = new Contacto();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Contacto.
     */
    @Test
    public void setTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Contacto instance = new Contacto();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Contacto.
     */
    @Test
    public void getValor() {
        System.out.println("getValor");
        Contacto instance = new Contacto();
        String expResult = "";
        String result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Contacto.
     */
    @Test
    public void setValor() {
        System.out.println("setValor");
        String valor = "";
        Contacto instance = new Contacto();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPermiso method, of class Contacto.
     */
    @Test
    public void getPermiso() {
        System.out.println("getPermiso");
        Contacto instance = new Contacto();
        Boolean expResult = null;
        Boolean result = instance.getPermiso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPermiso method, of class Contacto.
     */
    @Test
    public void setPermiso() {
        System.out.println("setPermiso");
        Boolean permiso = null;
        Contacto instance = new Contacto();
        instance.setPermiso(permiso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class Contacto.
     */
    @Test
    public void getCliente() {
        System.out.println("getCliente");
        Contacto instance = new Contacto();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class Contacto.
     */
    @Test
    public void setCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        Contacto instance = new Contacto();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Contacto.
     */
  
}