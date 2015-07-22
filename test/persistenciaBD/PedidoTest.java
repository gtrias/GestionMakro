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
public class PedidoTest {

    public PedidoTest() {
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
     * Test of getCodPedido method, of class Pedido.
     */
    @Test
    public void getCodPedido() {
        System.out.println("getCodPedido");
        Pedido instance = new Pedido();
        String expResult = "";
        String result = instance.getCodPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodPedido method, of class Pedido.
     */
    @Test
    public void setCodPedido() {
        System.out.println("setCodPedido");
        String codPedido = "";
        Pedido instance = new Pedido();
        instance.setCodPedido(codPedido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Pedido.
     */
    @Test
    public void getFecha() {
        System.out.println("getFecha");
        Pedido instance = new Pedido();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Pedido.
     */
    @Test
    public void setFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Pedido instance = new Pedido();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServido method, of class Pedido.
     */
    @Test
    public void getServido() {
        System.out.println("getServido");
        Pedido instance = new Pedido();
        boolean expResult = false;
        boolean result = instance.getServido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServido method, of class Pedido.
     */
    @Test
    public void setServido() {
        System.out.println("setServido");
        boolean servido = false;
        Pedido instance = new Pedido();
        instance.setServido(servido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAceptado method, of class Pedido.
     */
    @Test
    public void getAceptado() {
        System.out.println("getAceptado");
        Pedido instance = new Pedido();
        boolean expResult = false;
        boolean result = instance.getAceptado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAceptado method, of class Pedido.
     */
    @Test
    public void setAceptado() {
        System.out.println("setAceptado");
        boolean aceptado = false;
        Pedido instance = new Pedido();
        instance.setAceptado(aceptado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLineaPedidoCollection method, of class Pedido.
     */
    @Test
    public void getLineaPedidoCollection() {
        System.out.println("getLineaPedidoCollection");
        Pedido instance = new Pedido();
        Collection<LineaPedido> expResult = null;
        Collection<LineaPedido> result = instance.getLineaPedidoCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLineaPedidoCollection method, of class Pedido.
     */
    @Test
    public void setLineaPedidoCollection() {
        System.out.println("setLineaPedidoCollection");
        Collection<LineaPedido> lineaPedidoCollection = null;
        Pedido instance = new Pedido();
        instance.setLineaPedidoCollection(lineaPedidoCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodEmpleado method, of class Pedido.
     */
    @Test
    public void getCodEmpleado() {
        System.out.println("getCodEmpleado");
        Pedido instance = new Pedido();
        Empleado expResult = null;
        Empleado result = instance.getCodEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodEmpleado method, of class Pedido.
     */
    @Test
    public void setCodEmpleado() {
        System.out.println("setCodEmpleado");
        Empleado codEmpleado = null;
        Pedido instance = new Pedido();
        instance.setCodEmpleado(codEmpleado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodReserva method, of class Pedido.
     */
    @Test
    public void getCodReserva() {
        System.out.println("getCodReserva");
        Pedido instance = new Pedido();
        Reserva expResult = null;
        Reserva result = instance.getCodReserva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodReserva method, of class Pedido.
     */
    @Test
    public void setCodReserva() {
        System.out.println("setCodReserva");
        Reserva codReserva = null;
        Pedido instance = new Pedido();
        instance.setCodReserva(codReserva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  

}