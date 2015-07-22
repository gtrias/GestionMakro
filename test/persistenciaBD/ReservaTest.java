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
public class ReservaTest {

    public ReservaTest() {
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
     * Test of getCodReserva method, of class Reserva.
     */
    @Test
    public void getCodReserva() {
        System.out.println("getCodReserva");
        Reserva instance = new Reserva();
        String expResult = "";
        String result = instance.getCodReserva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodReserva method, of class Reserva.
     */
    @Test
    public void setCodReserva() {
        System.out.println("setCodReserva");
        String codReserva = "";
        Reserva instance = new Reserva();
        instance.setCodReserva(codReserva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Reserva.
     */
    @Test
    public void getFecha() {
        System.out.println("getFecha");
        Reserva instance = new Reserva();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Reserva.
     */
    @Test
    public void setFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Reserva instance = new Reserva();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPendiente method, of class Reserva.
     */
    @Test
    public void getPendiente() {
        System.out.println("getPendiente");
        Reserva instance = new Reserva();
        boolean expResult = false;
        boolean result = instance.getPendiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPendiente method, of class Reserva.
     */
    @Test
    public void setPendiente() {
        System.out.println("setPendiente");
        boolean pendiente = false;
        Reserva instance = new Reserva();
        instance.setPendiente(pendiente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIva method, of class Reserva.
     */
    @Test
    public void getIva() {
        System.out.println("getIva");
        Reserva instance = new Reserva();
        float expResult = 0.0F;
        float result = instance.getIva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIva method, of class Reserva.
     */
    @Test
    public void setIva() {
        System.out.println("setIva");
        float iva = 0.0F;
        Reserva instance = new Reserva();
        instance.setIva(iva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecargo method, of class Reserva.
     */
    @Test
    public void getRecargo() {
        System.out.println("getRecargo");
        Reserva instance = new Reserva();
        float expResult = 0.0F;
        float result = instance.getRecargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecargo method, of class Reserva.
     */
    @Test
    public void setRecargo() {
        System.out.println("setRecargo");
        float recargo = 0.0F;
        Reserva instance = new Reserva();
        instance.setRecargo(recargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Reserva.
     */
    @Test
    public void getTotal() {
        System.out.println("getTotal");
        Reserva instance = new Reserva();
        Float expResult = null;
        Float result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class Reserva.
     */
    @Test
    public void setTotal() {
        System.out.println("setTotal");
        Float total = null;
        Reserva instance = new Reserva();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLineaReservaCollection method, of class Reserva.
     */
    @Test
    public void getLineaReservaCollection() {
        System.out.println("getLineaReservaCollection");
        Reserva instance = new Reserva();
        Collection<LineaReserva> expResult = null;
        Collection<LineaReserva> result = instance.getLineaReservaCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLineaReservaCollection method, of class Reserva.
     */
    @Test
    public void setLineaReservaCollection() {
        System.out.println("setLineaReservaCollection");
        Collection<LineaReserva> lineaReservaCollection = null;
        Reserva instance = new Reserva();
        instance.setLineaReservaCollection(lineaReservaCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPedidoCollection method, of class Reserva.
     */
    @Test
    public void getPedidoCollection() {
        System.out.println("getPedidoCollection");
        Reserva instance = new Reserva();
        Collection<Pedido> expResult = null;
        Collection<Pedido> result = instance.getPedidoCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPedidoCollection method, of class Reserva.
     */
    @Test
    public void setPedidoCollection() {
        System.out.println("setPedidoCollection");
        Collection<Pedido> pedidoCollection = null;
        Reserva instance = new Reserva();
        instance.setPedidoCollection(pedidoCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodCliente method, of class Reserva.
     */
    @Test
    public void getCodCliente() {
        System.out.println("getCodCliente");
        Reserva instance = new Reserva();
        Cliente expResult = null;
        Cliente result = instance.getCodCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodCliente method, of class Reserva.
     */
    @Test
    public void setCodCliente() {
        System.out.println("setCodCliente");
        Cliente codCliente = null;
        Reserva instance = new Reserva();
        instance.setCodCliente(codCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodEmpleado method, of class Reserva.
     */
    @Test
    public void getCodEmpleado() {
        System.out.println("getCodEmpleado");
        Reserva instance = new Reserva();
        Empleado expResult = null;
        Empleado result = instance.getCodEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodEmpleado method, of class Reserva.
     */
    @Test
    public void setCodEmpleado() {
        System.out.println("setCodEmpleado");
        Empleado codEmpleado = null;
        Reserva instance = new Reserva();
        instance.setCodEmpleado(codEmpleado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   

}