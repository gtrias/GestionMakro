/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author genar
 */
@Entity
@Table(name = "articulo")
@NamedQueries({@NamedQuery(name = "Articulo.findByCodArticulo", query = "SELECT a FROM Articulo a WHERE a.codArticulo = :codArticulo"), @NamedQuery(name = "Articulo.findByNombre", query = "SELECT a FROM Articulo a WHERE a.nombre = :nombre"), @NamedQuery(name = "Articulo.findByDescripcion", query = "SELECT a FROM Articulo a WHERE a.descripcion = :descripcion"), @NamedQuery(name = "Articulo.findByExistencias", query = "SELECT a FROM Articulo a WHERE a.existencias = :existencias"), @NamedQuery(name = "Articulo.findByExistenciaMinima", query = "SELECT a FROM Articulo a WHERE a.existenciaMinima = :existenciaMinima"), @NamedQuery(name = "Articulo.findByPrecio", query = "SELECT a FROM Articulo a WHERE a.precio = :precio"), @NamedQuery(name = "Articulo.findByIva", query = "SELECT a FROM Articulo a WHERE a.iva = :iva"), @NamedQuery(name = "Articulo.findByRecargoEquivalencia", query = "SELECT a FROM Articulo a WHERE a.recargoEquivalencia = :recargoEquivalencia"), @NamedQuery(name = "Articulo.findByVentasSemana", query = "SELECT a FROM Articulo a WHERE a.ventasSemana = :ventasSemana"), @NamedQuery(name = "Articulo.findByMediaVentasSemanal", query = "SELECT a FROM Articulo a WHERE a.mediaVentasSemanal = :mediaVentasSemanal"), @NamedQuery(name = "Articulo.findByTotalVentas", query = "SELECT a FROM Articulo a WHERE a.totalVentas = :totalVentas"), @NamedQuery(name = "Articulo.findByNumRevisiones", query = "SELECT a FROM Articulo a WHERE a.numRevisiones = :numRevisiones")})
public class Articulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codArticulo", nullable = false)
    private String codArticulo;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "existencias", nullable = false)
    private long existencias;
    @Column(name = "existenciaMinima")
    private BigInteger existenciaMinima;
    @Column(name = "precio")
    private Float precio;
    @Column(name = "iva")
    private Float iva;
    @Column(name = "recargoEquivalencia")
    private Float recargoEquivalencia;
    @Column(name = "ventasSemana")
    private BigInteger ventasSemana;
    @Column(name = "mediaVentasSemanal")
    private BigInteger mediaVentasSemanal;
    @Column(name = "totalVentas")
    private BigInteger totalVentas;
    @Column(name = "numRevisiones")
    private Integer numRevisiones;
    @JoinColumn(name = "codProveedor", referencedColumnName = "codProveedor")
    @ManyToOne
    private Proveedor codProveedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articulo")
    private Collection<LineaReserva> lineaReservaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articulo")
    private Collection<LineaPedido> lineaPedidoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articulo")
    private Collection<LineaVenta> lineaVentaCollection;

    public Articulo() {
    }

    public Articulo(String codArticulo) {
        this.codArticulo = codArticulo;
    }

    public Articulo(String codArticulo, String nombre, String descripcion, long existencias) {
        this.codArticulo = codArticulo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.existencias = existencias;
    }

    public String getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(String codArticulo) {
        this.codArticulo = codArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getExistencias() {
        return existencias;
    }

    public void setExistencias(long existencias) {
        this.existencias = existencias;
    }

    public BigInteger getExistenciaMinima() {
        return existenciaMinima;
    }

    public void setExistenciaMinima(BigInteger existenciaMinima) {
        this.existenciaMinima = existenciaMinima;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Float getIva() {
        return iva;
    }

    public void setIva(Float iva) {
        this.iva = iva;
    }

    public Float getRecargoEquivalencia() {
        return recargoEquivalencia;
    }

    public void setRecargoEquivalencia(Float recargoEquivalencia) {
        this.recargoEquivalencia = recargoEquivalencia;
    }

    public BigInteger getVentasSemana() {
        return ventasSemana;
    }

    public void setVentasSemana(BigInteger ventasSemana) {
        this.ventasSemana = ventasSemana;
    }

    public BigInteger getMediaVentasSemanal() {
        return mediaVentasSemanal;
    }

    public void setMediaVentasSemanal(BigInteger mediaVentasSemanal) {
        this.mediaVentasSemanal = mediaVentasSemanal;
    }

    public BigInteger getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(BigInteger totalVentas) {
        this.totalVentas = totalVentas;
    }

    public Integer getNumRevisiones() {
        return numRevisiones;
    }

    public void setNumRevisiones(Integer numRevisiones) {
        this.numRevisiones = numRevisiones;
    }

    public Proveedor getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Proveedor codProveedor) {
        this.codProveedor = codProveedor;
    }

    public Collection<LineaReserva> getLineaReservaCollection() {
        return lineaReservaCollection;
    }

    public void setLineaReservaCollection(Collection<LineaReserva> lineaReservaCollection) {
        this.lineaReservaCollection = lineaReservaCollection;
    }

    public Collection<LineaPedido> getLineaPedidoCollection() {
        return lineaPedidoCollection;
    }

    public void setLineaPedidoCollection(Collection<LineaPedido> lineaPedidoCollection) {
        this.lineaPedidoCollection = lineaPedidoCollection;
    }

    public Collection<LineaVenta> getLineaVentaCollection() {
        return lineaVentaCollection;
    }

    public void setLineaVentaCollection(Collection<LineaVenta> lineaVentaCollection) {
        this.lineaVentaCollection = lineaVentaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codArticulo != null ? codArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulo)) {
            return false;
        }
        Articulo other = (Articulo) object;
        if ((this.codArticulo == null && other.codArticulo != null) || (this.codArticulo != null && !this.codArticulo.equals(other.codArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.Articulo[codArticulo=" + codArticulo + "]";
    }

}
