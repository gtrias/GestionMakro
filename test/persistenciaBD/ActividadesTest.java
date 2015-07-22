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
public class ActividadesTest {

    public ActividadesTest() {
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
     * Test of getCodActividad method, of class Actividades.
     */
    @Test
    public void getCodActividad() {
        System.out.println("getCodActividad");
        Actividades instance = new Actividades();
        String expResult = "";
        String result = instance.getCodActividad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodActividad method, of class Actividades.
     */
    @Test
    public void setCodActividad() {
        System.out.println("setCodActividad");
        String codActividad = "";
        Actividades instance = new Actividades();
        instance.setCodActividad(codActividad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Actividades.
     */
    @Test
    public void getNombre() {
        System.out.println("getNombre");
        Actividades instance = new Actividades();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Actividades.
     */
    @Test
    public void setNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Actividades instance = new Actividades();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Actividades.
     */
    @Test
    public void getDescripcion() {
        System.out.println("getDescripcion");
        Actividades instance = new Actividades();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Actividades.
     */
    @Test
    public void setDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Actividades instance = new Actividades();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClienteCollection method, of class Actividades.
     */
    @Test
    public void getClienteCollection() {
        System.out.println("getClienteCollection");
        Actividades instance = new Actividades();
        Collection<Cliente> expResult = null;
        Collection<Cliente> result = instance.getClienteCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClienteCollection method, of class Actividades.
     */
    @Test
    public void setClienteCollection() {
        System.out.println("setClienteCollection");
        Collection<Cliente> clienteCollection = null;
        Actividades instance = new Actividades();
        instance.setClienteCollection(clienteCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Actividades.
     */
}