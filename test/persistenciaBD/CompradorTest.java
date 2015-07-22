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
public class CompradorTest {

    public CompradorTest() {
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
     * Test of getCompradorPK method, of class Comprador.
     */
    @Test
    public void getCompradorPK() {
        System.out.println("getCompradorPK");
        Comprador instance = new Comprador();
        CompradorPK expResult = null;
        CompradorPK result = instance.getCompradorPK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompradorPK method, of class Comprador.
     */
    @Test
    public void setCompradorPK() {
        System.out.println("setCompradorPK");
        CompradorPK compradorPK = null;
        Comprador instance = new Comprador();
        instance.setCompradorPK(compradorPK);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Comprador.
     */
    @Test
    public void getNombre() {
        System.out.println("getNombre");
        Comprador instance = new Comprador();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Comprador.
     */
    @Test
    public void setNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Comprador instance = new Comprador();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Comprador.
     */
    @Test
    public void getApellidos() {
        System.out.println("getApellidos");
        Comprador instance = new Comprador();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidos method, of class Comprador.
     */
    @Test
    public void setApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        Comprador instance = new Comprador();
        instance.setApellidos(apellidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Comprador.
     */
    @Test
    public void getTelefono() {
        System.out.println("getTelefono");
        Comprador instance = new Comprador();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Comprador.
     */
    @Test
    public void setTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Comprador instance = new Comprador();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovil method, of class Comprador.
     */
    @Test
    public void getMovil() {
        System.out.println("getMovil");
        Comprador instance = new Comprador();
        String expResult = "";
        String result = instance.getMovil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMovil method, of class Comprador.
     */
    @Test
    public void setMovil() {
        System.out.println("setMovil");
        String movil = "";
        Comprador instance = new Comprador();
        instance.setMovil(movil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFax method, of class Comprador.
     */
    @Test
    public void getFax() {
        System.out.println("getFax");
        Comprador instance = new Comprador();
        String expResult = "";
        String result = instance.getFax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFax method, of class Comprador.
     */
    @Test
    public void setFax() {
        System.out.println("setFax");
        String fax = "";
        Comprador instance = new Comprador();
        instance.setFax(fax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Comprador.
     */
    @Test
    public void getEmail() {
        System.out.println("getEmail");
        Comprador instance = new Comprador();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Comprador.
     */
    @Test
    public void setEmail() {
        System.out.println("setEmail");
        String email = "";
        Comprador instance = new Comprador();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class Comprador.
     */
    @Test
    public void getCliente() {
        System.out.println("getCliente");
        Comprador instance = new Comprador();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class Comprador.
     */
    @Test
    public void setCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        Comprador instance = new Comprador();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Comprador.
     */
 

}