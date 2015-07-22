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
public class TiposClienteTest {

    public TiposClienteTest() {
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
     * Test of getCodTipo method, of class TiposCliente.
     */
    @Test
    public void getCodTipo() {
        System.out.println("getCodTipo");
        TiposCliente instance = new TiposCliente();
        String expResult = "";
        String result = instance.getCodTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodTipo method, of class TiposCliente.
     */
    @Test
    public void setCodTipo() {
        System.out.println("setCodTipo");
        String codTipo = "";
        TiposCliente instance = new TiposCliente();
        instance.setCodTipo(codTipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class TiposCliente.
     */
    @Test
    public void getNombre() {
        System.out.println("getNombre");
        TiposCliente instance = new TiposCliente();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class TiposCliente.
     */
    @Test
    public void setNombre() {
        System.out.println("setNombre");
        String nombre = "";
        TiposCliente instance = new TiposCliente();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class TiposCliente.
     */
    @Test
    public void getDescripcion() {
        System.out.println("getDescripcion");
        TiposCliente instance = new TiposCliente();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class TiposCliente.
     */
    @Test
    public void setDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        TiposCliente instance = new TiposCliente();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClienteCollection method, of class TiposCliente.
     */
    @Test
    public void getClienteCollection() {
        System.out.println("getClienteCollection");
        TiposCliente instance = new TiposCliente();
        Collection<Cliente> expResult = null;
        Collection<Cliente> result = instance.getClienteCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClienteCollection method, of class TiposCliente.
     */
    @Test
    public void setClienteCollection() {
        System.out.println("setClienteCollection");
        Collection<Cliente> clienteCollection = null;
        TiposCliente instance = new TiposCliente();
        instance.setClienteCollection(clienteCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   

}