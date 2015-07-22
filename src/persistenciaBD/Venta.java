/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author genar
 */
@Entity
@Table(name = "venta")
@NamedQueries({@NamedQuery(name = "Venta.findByCodVenta", query = "SELECT v FROM Venta v WHERE v.codVenta = :codVenta"), @NamedQuery(name = "Venta.findByFecha", query = "SELECT v FROM Venta v WHERE v.fecha = :fecha"), @NamedQuery(name = "Venta.findByImporte", query = "SELECT v FROM Venta v WHERE v.importe = :importe"), @NamedQuery(name = "Venta.findByIva", query = "SELECT v FROM Venta v WHERE v.iva = :iva"), @NamedQuery(name = "Venta.findByRecargoEquivalencia", query = "SELECT v FROM Venta v WHERE v.recargoEquivalencia = :recargoEquivalencia"), @NamedQuery(name = "Venta.findByTotal", query = "SELECT v FROM Venta v WHERE v.total = :total")})
public class Venta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codVenta", nullable = false)
    private String codVenta;
    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "importe")
    private Float importe;
    @Column(name = "iva")
    private Float iva;
    @Column(name = "recargoEquivalencia")
    private Float recargoEquivalencia;
    @Column(name = "total")
    private Float total;
    @JoinColumn(name = "codCliente", referencedColumnName = "codCliente")
    @ManyToOne
    private Cliente codCliente;
    @JoinColumn(name = "codEmpleado", referencedColumnName = "codEmpleado")
    @ManyToOne
    private Empleado codEmpleado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "venta")
    private Collection<LineaVenta> lineaVentaCollection;

    public Venta() {
    }

    public Venta(String codVenta) {
        this.codVenta = codVenta;
    }

    public Venta(String codVenta, Date fecha) {
        this.codVenta = codVenta;
        this.fecha = fecha;
    }

    public String getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(String codVenta) {
        this.codVenta = codVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getImporte() {
        return importe;
    }

    public void setImporte(Float importe) {
        this.importe = importe;
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

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Cliente getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Cliente codCliente) {
        this.codCliente = codCliente;
    }

    public Empleado getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(Empleado codEmpleado) {
        this.codEmpleado = codEmpleado;
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
        hash += (codVenta != null ? codVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.codVenta == null && other.codVenta != null) || (this.codVenta != null && !this.codVenta.equals(other.codVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.Venta[codVenta=" + codVenta + "]";
    }

}
