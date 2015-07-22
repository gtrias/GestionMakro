/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
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
public class ControlClientesTest {

    public ControlClientesTest() {
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
     * Test of obtenerInstancia method, of class ControlClientes.
     */
    @Test
    public void obtenerInstancia() {
        System.out.println("obtenerInstancia");
        ControlClientes expResult = null;
        ControlClientes result = ControlClientes.obtenerInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCliente method, of class ControlClientes.
     */
    @Test
    public void obtenerCliente() {
        System.out.println("obtenerCliente");
        String cod = "";
        ControlClientes instance = null;
        Cliente expResult = null;
        Cliente result = instance.obtenerCliente(cod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTodosLosClientes method, of class ControlClientes.
     */
    @Test
    public void obtenerTodosLosClientes() {
        System.out.println("obtenerTodosLosClientes");
        ControlClientes instance = null;
        List expResult = null;
        List result = instance.obtenerTodosLosClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTipoCliente method, of class ControlClientes.
     */
    @Test
    public void obtenerTipoCliente() {
        System.out.println("obtenerTipoCliente");
        String cod = "";
        ControlClientes instance = null;
        TiposCliente expResult = null;
        TiposCliente result = instance.obtenerTipoCliente(cod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerActividad method, of class ControlClientes.
     */
    @Test
    public void obtenerActividad() {
        System.out.println("obtenerActividad");
        String codActividad = "";
        ControlClientes instance = null;
        Actividades expResult = null;
        Actividades result = instance.obtenerActividad(codActividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCompradores method, of class ControlClientes.
     */
    @Test
    public void obtenerCompradores() {
        System.out.println("obtenerCompradores");
        Cliente cli = null;
        ControlClientes instance = null;
        Iterator expResult = null;
        Iterator result = instance.obtenerCompradores(cli);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerComprador method, of class ControlClientes.
     */
    @Test
    public void obtenerComprador() {
        System.out.println("obtenerComprador");
        int pos = 0;
        Cliente cli = null;
        ControlClientes instance = null;
        Comprador expResult = null;
        Comprador result = instance.obtenerComprador(pos, cli);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMensajeBloqueo method, of class ControlClientes.
     */
    @Test
    public void obtenerMensajeBloqueo() {
        System.out.println("obtenerMensajeBloqueo");
        Cliente cli = null;
        ControlClientes instance = null;
        String expResult = "";
        String result = instance.obtenerMensajeBloqueo(cli);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerListaBloqueos method, of class ControlClientes.
     */
    @Test
    public void obtenerListaBloqueos() {
        System.out.println("obtenerListaBloqueos");
        ControlClientes instance = null;
        List expResult = null;
        List result = instance.obtenerListaBloqueos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCodBloqueo method, of class ControlClientes.
     */
    @Test
    public void obtenerCodBloqueo() {
        System.out.println("obtenerCodBloqueo");
        Cliente cli = null;
        ControlClientes instance = null;
        String expResult = "";
        String result = instance.obtenerCodBloqueo(cli);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCodigoClienteLibre method, of class ControlClientes.
     */
    @Test
    public void obtenerCodigoClienteLibre() {
        System.out.println("obtenerCodigoClienteLibre");
        ControlClientes instance = null;
        String expResult = "";
        String result = instance.obtenerCodigoClienteLibre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevoCliente method, of class ControlClientes.
     */
    @Test
    public void nuevoCliente() {
        System.out.println("nuevoCliente");
        String nombre = "";
        String nif = "";
        String direccion = "";
        String cp = "";
        String codTipo = "";
        Boolean recargo = null;
        String codActividad = "";
        ControlClientes instance = null;
        Boolean expResult = null;
        Boolean result = instance.nuevoCliente(nombre, nif, direccion, cp, codTipo, recargo, codActividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerFecha method, of class ControlClientes.
     */
    @Test
    public void obtenerFecha() {
        System.out.println("obtenerFecha");
        ControlClientes instance = null;
        Date expResult = null;
        Date result = instance.obtenerFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anadirCliente method, of class ControlClientes.
     */
    @Test
    public void anadirCliente() {
        System.out.println("anadirCliente");
        Cliente c = null;
        ControlClientes instance = null;
        boolean expResult = false;
        boolean result = instance.anadirCliente(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarCliente method, of class ControlClientes.
     */
    @Test
    public void borrarCliente() {
        System.out.println("borrarCliente");
        Cliente c = null;
        ControlClientes instance = null;
        boolean expResult = false;
        boolean result = instance.borrarCliente(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarCliente method, of class ControlClientes.
     */
    @Test
    public void actualizarCliente() {
        System.out.println("actualizarCliente");
        Cliente c = null;
        ControlClientes instance = null;
        boolean expResult = false;
        boolean result = instance.actualizarCliente(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}