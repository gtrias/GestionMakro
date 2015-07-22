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
public class VentaTest {

    public VentaTest() {
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
     * Test of getCodVenta method, of class Venta.
     */
    @Test
    public void getCodVenta() {
        System.out.println("getCodVenta");
        Venta instance = new Venta();
        String expResult = "";
        String result = instance.getCodVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodVenta method, of class Venta.
     */
    @Test
    public void setCodVenta() {
        System.out.println("setCodVenta");
        String codVenta = "";
        Venta instance = new Venta();
        instance.setCodVenta(codVenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Venta.
     */
    @Test
    public void getFecha() {
        System.out.println("getFecha");
        Venta instance = new Venta();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Venta.
     */
    @Test
    public void setFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Venta instance = new Venta();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImporte method, of class Venta.
     */
    @Test
    public void getImporte() {
        System.out.println("getImporte");
        Venta instance = new Venta();
        Float expResult = null;
        Float result = instance.getImporte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImporte method, of class Venta.
     */
    @Test
    public void setImporte() {
        System.out.println("setImporte");
        Float importe = null;
        Venta instance = new Venta();
        instance.setImporte(importe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIva method, of class Venta.
     */
    @Test
    public void getIva() {
        System.out.println("getIva");
        Venta instance = new Venta();
        Float expResult = null;
        Float result = instance.getIva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIva method, of class Venta.
     */
    @Test
    public void setIva() {
        System.out.println("setIva");
        Float iva = null;
        Venta instance = new Venta();
        instance.setIva(iva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecargoEquivalencia method, of class Venta.
     */
    @Test
    public void getRecargoEquivalencia() {
        System.out.println("getRecargoEquivalencia");
        Venta instance = new Venta();
        Float expResult = null;
        Float result = instance.getRecargoEquivalencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecargoEquivalencia method, of class Venta.
     */
    @Test
    public void setRecargoEquivalencia() {
        System.out.println("setRecargoEquivalencia");
        Float recargoEquivalencia = null;
        Venta instance = new Venta();
        instance.setRecargoEquivalencia(recargoEquivalencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Venta.
     */
    @Test
    public void getTotal() {
        System.out.println("getTotal");
        Venta instance = new Venta();
        Float expResult = null;
        Float result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class Venta.
     */
    @Test
    public void setTotal() {
        System.out.println("setTotal");
        Float total = null;
        Venta instance = new Venta();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodCliente method, of class Venta.
     */
    @Test
    public void getCodCliente() {
        System.out.println("getCodCliente");
        Venta instance = new Venta();
        Cliente expResult = null;
        Cliente result = instance.getCodCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodCliente method, of class Venta.
     */
    @Test
    public void setCodCliente() {
        System.out.println("setCodCliente");
        Cliente codCliente = null;
        Venta instance = new Venta();
        instance.setCodCliente(codCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodEmpleado method, of class Venta.
     */
    @Test
    public void getCodEmpleado() {
        System.out.println("getCodEmpleado");
        Venta instance = new Venta();
        Empleado expResult = null;
        Empleado result = instance.getCodEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodEmpleado method, of class Venta.
     */
    @Test
    public void setCodEmpleado() {
        System.out.println("setCodEmpleado");
        Empleado codEmpleado = null;
        Venta instance = new Venta();
        instance.setCodEmpleado(codEmpleado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLineaVentaCollection method, of class Venta.
     */
    @Test
    public void getLineaVentaCollection() {
        System.out.println("getLineaVentaCollection");
        Venta instance = new Venta();
        Collection<LineaVenta> expResult = null;
        Collection<LineaVenta> result = instance.getLineaVentaCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLineaVentaCollection method, of class Venta.
     */
    @Test
    public void setLineaVentaCollection() {
        System.out.println("setLineaVentaCollection");
        Collection<LineaVenta> lineaVentaCollection = null;
        Venta instance = new Venta();
        instance.setLineaVentaCollection(lineaVentaCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 

}