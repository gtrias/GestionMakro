/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;

import java.util.Collection;
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
public class ProveedorTest {

    public ProveedorTest() {
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
     * Test of getCodProveedor method, of class Proveedor.
     */
    @Test
    public void getCodProveedor() {
        System.out.println("getCodProveedor");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getCodProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodProveedor method, of class Proveedor.
     */
    @Test
    public void setCodProveedor() {
        System.out.println("setCodProveedor");
        String codProveedor = "";
        Proveedor instance = new Proveedor();
        instance.setCodProveedor(codProveedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Proveedor.
     */
    @Test
    public void getNombre() {
        System.out.println("getNombre");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Proveedor.
     */
    @Test
    public void setNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Proveedor instance = new Proveedor();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Proveedor.
     */
    @Test
    public void getDireccion() {
        System.out.println("getDireccion");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Proveedor.
     */
    @Test
    public void setDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Proveedor instance = new Proveedor();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Proveedor.
     */
    @Test
    public void getEmail() {
        System.out.println("getEmail");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Proveedor.
     */
    @Test
    public void setEmail() {
        System.out.println("setEmail");
        String email = "";
        Proveedor instance = new Proveedor();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Proveedor.
     */
    @Test
    public void getTelefono() {
        System.out.println("getTelefono");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Proveedor.
     */
    @Test
    public void setTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Proveedor instance = new Proveedor();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArticuloCollection method, of class Proveedor.
     */
    @Test
    public void getArticuloCollection() {
        System.out.println("getArticuloCollection");
        Proveedor instance = new Proveedor();
        Collection<Articulo> expResult = null;
        Collection<Articulo> result = instance.getArticuloCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArticuloCollection method, of class Proveedor.
     */
    @Test
    public void setArticuloCollection() {
        System.out.println("setArticuloCollection");
        Collection<Articulo> articuloCollection = null;
        Proveedor instance = new Proveedor();
        instance.setArticuloCollection(articuloCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   

}