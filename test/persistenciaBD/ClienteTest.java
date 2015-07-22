/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;

import java.util.Collection;
import java.util.Date;
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
public class ClienteTest {

    public ClienteTest() {
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
     * Test of getCodCliente method, of class Cliente.
     */
    @Test
    public void getCodCliente() {
        System.out.println("getCodCliente");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getCodCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodCliente method, of class Cliente.
     */
    @Test
    public void setCodCliente() {
        System.out.println("setCodCliente");
        String codCliente = "";
        Cliente instance = new Cliente();
        instance.setCodCliente(codCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNif method, of class Cliente.
     */
    @Test
    public void getNif() {
        System.out.println("getNif");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNif();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNif method, of class Cliente.
     */
    @Test
    public void setNif() {
        System.out.println("setNif");
        String nif = "";
        Cliente instance = new Cliente();
        instance.setNif(nif);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void getNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void setNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = new Cliente();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecargo method, of class Cliente.
     */
    @Test
    public void getRecargo() {
        System.out.println("getRecargo");
        Cliente instance = new Cliente();
        boolean expResult = false;
        boolean result = instance.getRecargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecargo method, of class Cliente.
     */
    @Test
    public void setRecargo() {
        System.out.println("setRecargo");
        boolean recargo = false;
        Cliente instance = new Cliente();
        instance.setRecargo(recargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaAlta method, of class Cliente.
     */
    @Test
    public void getFechaAlta() {
        System.out.println("getFechaAlta");
        Cliente instance = new Cliente();
        Date expResult = null;
        Date result = instance.getFechaAlta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaAlta method, of class Cliente.
     */
    @Test
    public void setFechaAlta() {
        System.out.println("setFechaAlta");
        Date fechaAlta = null;
        Cliente instance = new Cliente();
        instance.setFechaAlta(fechaAlta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Cliente.
     */
    @Test
    public void getDireccion() {
        System.out.println("getDireccion");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Cliente.
     */
    @Test
    public void setDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Cliente instance = new Cliente();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigoPostal method, of class Cliente.
     */
    @Test
    public void getCodigoPostal() {
        System.out.println("getCodigoPostal");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getCodigoPostal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoPostal method, of class Cliente.
     */
    @Test
    public void setCodigoPostal() {
        System.out.println("setCodigoPostal");
        String codigoPostal = "";
        Cliente instance = new Cliente();
        instance.setCodigoPostal(codigoPostal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajeBloque method, of class Cliente.
     */
    @Test
    public void getMensajeBloque() {
        System.out.println("getMensajeBloque");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getMensajeBloque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMensajeBloque method, of class Cliente.
     */
    @Test
    public void setMensajeBloque() {
        System.out.println("setMensajeBloque");
        String mensajeBloque = "";
        Cliente instance = new Cliente();
        instance.setMensajeBloque(mensajeBloque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVentaCollection method, of class Cliente.
     */
    @Test
    public void getVentaCollection() {
        System.out.println("getVentaCollection");
        Cliente instance = new Cliente();
        Collection<Venta> expResult = null;
        Collection<Venta> result = instance.getVentaCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVentaCollection method, of class Cliente.
     */
    @Test
    public void setVentaCollection() {
        System.out.println("setVentaCollection");
        Collection<Venta> ventaCollection = null;
        Cliente instance = new Cliente();
        instance.setVentaCollection(ventaCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContactoCollection method, of class Cliente.
     */
    @Test
    public void getContactoCollection() {
        System.out.println("getContactoCollection");
        Cliente instance = new Cliente();
        Collection<Contacto> expResult = null;
        Collection<Contacto> result = instance.getContactoCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContactoCollection method, of class Cliente.
     */
    @Test
    public void setContactoCollection() {
        System.out.println("setContactoCollection");
        Collection<Contacto> contactoCollection = null;
        Cliente instance = new Cliente();
        instance.setContactoCollection(contactoCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodTipo method, of class Cliente.
     */
    @Test
    public void getCodTipo() {
        System.out.println("getCodTipo");
        Cliente instance = new Cliente();
        TiposCliente expResult = null;
        TiposCliente result = instance.getCodTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodTipo method, of class Cliente.
     */
    @Test
    public void setCodTipo() {
        System.out.println("setCodTipo");
        TiposCliente codTipo = null;
        Cliente instance = new Cliente();
        instance.setCodTipo(codTipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodActividad method, of class Cliente.
     */
    @Test
    public void getCodActividad() {
        System.out.println("getCodActividad");
        Cliente instance = new Cliente();
        Actividades expResult = null;
        Actividades result = instance.getCodActividad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodActividad method, of class Cliente.
     */
    @Test
    public void setCodActividad() {
        System.out.println("setCodActividad");
        Actividades codActividad = null;
        Cliente instance = new Cliente();
        instance.setCodActividad(codActividad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodBloqueo method, of class Cliente.
     */
    @Test
    public void getCodBloqueo() {
        System.out.println("getCodBloqueo");
        Cliente instance = new Cliente();
        Bloqueo expResult = null;
        Bloqueo result = instance.getCodBloqueo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodBloqueo method, of class Cliente.
     */
    @Test
    public void setCodBloqueo() {
        System.out.println("setCodBloqueo");
        Bloqueo codBloqueo = null;
        Cliente instance = new Cliente();
        instance.setCodBloqueo(codBloqueo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompradorCollection method, of class Cliente.
     */
    @Test
    public void getCompradorCollection() {
        System.out.println("getCompradorCollection");
        Cliente instance = new Cliente();
        Collection<Comprador> expResult = null;
        Collection<Comprador> result = instance.getCompradorCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompradorCollection method, of class Cliente.
     */
    @Test
    public void setCompradorCollection() {
        System.out.println("setCompradorCollection");
        Collection<Comprador> compradorCollection = null;
        Cliente instance = new Cliente();
        instance.setCompradorCollection(compradorCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReservaCollection method, of class Cliente.
     */
    @Test
    public void getReservaCollection() {
        System.out.println("getReservaCollection");
        Cliente instance = new Cliente();
        Collection<Reserva> expResult = null;
        Collection<Reserva> result = instance.getReservaCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReservaCollection method, of class Cliente.
     */
    @Test
    public void setReservaCollection() {
        System.out.println("setReservaCollection");
        Collection<Reserva> reservaCollection = null;
        Cliente instance = new Cliente();
        instance.setReservaCollection(reservaCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Cliente.
     */
    

}