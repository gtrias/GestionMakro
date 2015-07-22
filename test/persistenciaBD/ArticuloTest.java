/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;

import java.math.BigInteger;
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
public class ArticuloTest {

    public ArticuloTest() {
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
     * Test of getCodArticulo method, of class Articulo.
     */
    @Test
    public void getCodArticulo() {
        System.out.println("getCodArticulo");
        Articulo instance = new Articulo();
        String expResult = "";
        String result = instance.getCodArticulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodArticulo method, of class Articulo.
     */
    @Test
    public void setCodArticulo() {
        System.out.println("setCodArticulo");
        String codArticulo = "";
        Articulo instance = new Articulo();
        instance.setCodArticulo(codArticulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Articulo.
     */
    @Test
    public void getNombre() {
        System.out.println("getNombre");
        Articulo instance = new Articulo();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Articulo.
     */
    @Test
    public void setNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Articulo instance = new Articulo();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Articulo.
     */
    @Test
    public void getDescripcion() {
        System.out.println("getDescripcion");
        Articulo instance = new Articulo();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Articulo.
     */
    @Test
    public void setDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Articulo instance = new Articulo();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExistencias method, of class Articulo.
     */
    @Test
    public void getExistencias() {
        System.out.println("getExistencias");
        Articulo instance = new Articulo();
        long expResult = 0L;
        long result = instance.getExistencias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExistencias method, of class Articulo.
     */
    @Test
    public void setExistencias() {
        System.out.println("setExistencias");
        long existencias = 0L;
        Articulo instance = new Articulo();
        instance.setExistencias(existencias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExistenciaMinima method, of class Articulo.
     */
    @Test
    public void getExistenciaMinima() {
        System.out.println("getExistenciaMinima");
        Articulo instance = new Articulo();
        BigInteger expResult = null;
        BigInteger result = instance.getExistenciaMinima();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExistenciaMinima method, of class Articulo.
     */
    @Test
    public void setExistenciaMinima() {
        System.out.println("setExistenciaMinima");
        BigInteger existenciaMinima = null;
        Articulo instance = new Articulo();
        instance.setExistenciaMinima(existenciaMinima);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Articulo.
     */
    @Test
    public void getPrecio() {
        System.out.println("getPrecio");
        Articulo instance = new Articulo();
        Float expResult = null;
        Float result = instance.getPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Articulo.
     */
    @Test
    public void setPrecio() {
        System.out.println("setPrecio");
        Float precio = null;
        Articulo instance = new Articulo();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIva method, of class Articulo.
     */
    @Test
    public void getIva() {
        System.out.println("getIva");
        Articulo instance = new Articulo();
        Float expResult = null;
        Float result = instance.getIva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIva method, of class Articulo.
     */
    @Test
    public void setIva() {
        System.out.println("setIva");
        Float iva = null;
        Articulo instance = new Articulo();
        instance.setIva(iva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecargoEquivalencia method, of class Articulo.
     */
    @Test
    public void getRecargoEquivalencia() {
        System.out.println("getRecargoEquivalencia");
        Articulo instance = new Articulo();
        Float expResult = null;
        Float result = instance.getRecargoEquivalencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecargoEquivalencia method, of class Articulo.
     */
    @Test
    public void setRecargoEquivalencia() {
        System.out.println("setRecargoEquivalencia");
        Float recargoEquivalencia = null;
        Articulo instance = new Articulo();
        instance.setRecargoEquivalencia(recargoEquivalencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVentasSemana method, of class Articulo.
     */
    @Test
    public void getVentasSemana() {
        System.out.println("getVentasSemana");
        Articulo instance = new Articulo();
        BigInteger expResult = null;
        BigInteger result = instance.getVentasSemana();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVentasSemana method, of class Articulo.
     */
    @Test
    public void setVentasSemana() {
        System.out.println("setVentasSemana");
        BigInteger ventasSemana = null;
        Articulo instance = new Articulo();
        instance.setVentasSemana(ventasSemana);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMediaVentasSemanal method, of class Articulo.
     */
    @Test
    public void getMediaVentasSemanal() {
        System.out.println("getMediaVentasSemanal");
        Articulo instance = new Articulo();
        BigInteger expResult = null;
        BigInteger result = instance.getMediaVentasSemanal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMediaVentasSemanal method, of class Articulo.
     */
    @Test
    public void setMediaVentasSemanal() {
        System.out.println("setMediaVentasSemanal");
        BigInteger mediaVentasSemanal = null;
        Articulo instance = new Articulo();
        instance.setMediaVentasSemanal(mediaVentasSemanal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalVentas method, of class Articulo.
     */
    @Test
    public void getTotalVentas() {
        System.out.println("getTotalVentas");
        Articulo instance = new Articulo();
        BigInteger expResult = null;
        BigInteger result = instance.getTotalVentas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalVentas method, of class Articulo.
     */
    @Test
    public void setTotalVentas() {
        System.out.println("setTotalVentas");
        BigInteger totalVentas = null;
        Articulo instance = new Articulo();
        instance.setTotalVentas(totalVentas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumRevisiones method, of class Articulo.
     */
    @Test
    public void getNumRevisiones() {
        System.out.println("getNumRevisiones");
        Articulo instance = new Articulo();
        Integer expResult = null;
        Integer result = instance.getNumRevisiones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumRevisiones method, of class Articulo.
     */
    @Test
    public void setNumRevisiones() {
        System.out.println("setNumRevisiones");
        Integer numRevisiones = null;
        Articulo instance = new Articulo();
        instance.setNumRevisiones(numRevisiones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodProveedor method, of class Articulo.
     */
    @Test
    public void getCodProveedor() {
        System.out.println("getCodProveedor");
        Articulo instance = new Articulo();
        Proveedor expResult = null;
        Proveedor result = instance.getCodProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodProveedor method, of class Articulo.
     */
    @Test
    public void setCodProveedor() {
        System.out.println("setCodProveedor");
        Proveedor codProveedor = null;
        Articulo instance = new Articulo();
        instance.setCodProveedor(codProveedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLineaReservaCollection method, of class Articulo.
     */
    @Test
    public void getLineaReservaCollection() {
        System.out.println("getLineaReservaCollection");
        Articulo instance = new Articulo();
        Collection<LineaReserva> expResult = null;
        Collection<LineaReserva> result = instance.getLineaReservaCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLineaReservaCollection method, of class Articulo.
     */
    @Test
    public void setLineaReservaCollection() {
        System.out.println("setLineaReservaCollection");
        Collection<LineaReserva> lineaReservaCollection = null;
        Articulo instance = new Articulo();
        instance.setLineaReservaCollection(lineaReservaCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLineaPedidoCollection method, of class Articulo.
     */
    @Test
    public void getLineaPedidoCollection() {
        System.out.println("getLineaPedidoCollection");
        Articulo instance = new Articulo();
        Collection<LineaPedido> expResult = null;
        Collection<LineaPedido> result = instance.getLineaPedidoCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLineaPedidoCollection method, of class Articulo.
     */
    @Test
    public void setLineaPedidoCollection() {
        System.out.println("setLineaPedidoCollection");
        Collection<LineaPedido> lineaPedidoCollection = null;
        Articulo instance = new Articulo();
        instance.setLineaPedidoCollection(lineaPedidoCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLineaVentaCollection method, of class Articulo.
     */
    @Test
    public void getLineaVentaCollection() {
        System.out.println("getLineaVentaCollection");
        Articulo instance = new Articulo();
        Collection<LineaVenta> expResult = null;
        Collection<LineaVenta> result = instance.getLineaVentaCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLineaVentaCollection method, of class Articulo.
     */
    @Test
    public void setLineaVentaCollection() {
        System.out.println("setLineaVentaCollection");
        Collection<LineaVenta> lineaVentaCollection = null;
        Articulo instance = new Articulo();
        instance.setLineaVentaCollection(lineaVentaCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Articulo.
     */
   
}