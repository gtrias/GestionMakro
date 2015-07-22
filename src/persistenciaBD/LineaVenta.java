/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author genar
 */
@Entity
@Table(name = "lineaVenta")
@NamedQueries({@NamedQuery(name = "LineaVenta.findByCodVenta", query = "SELECT l FROM LineaVenta l WHERE l.lineaVentaPK.codVenta = :codVenta"), @NamedQuery(name = "LineaVenta.findByCodArticulo", query = "SELECT l FROM LineaVenta l WHERE l.lineaVentaPK.codArticulo = :codArticulo"), @NamedQuery(name = "LineaVenta.findByCantidad", query = "SELECT l FROM LineaVenta l WHERE l.cantidad = :cantidad"), @NamedQuery(name = "LineaVenta.findBySubTotal", query = "SELECT l FROM LineaVenta l WHERE l.subTotal = :subTotal"), @NamedQuery(name = "LineaVenta.findByIva", query = "SELECT l FROM LineaVenta l WHERE l.iva = :iva"), @NamedQuery(name = "LineaVenta.findByRecargo", query = "SELECT l FROM LineaVenta l WHERE l.recargo = :recargo")})
public class LineaVenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LineaVentaPK lineaVentaPK;
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    @Column(name = "subTotal")
    private Float subTotal;
    @Column(name = "iva", nullable = false)
    private float iva;
    @Column(name = "recargo", nullable = false)
    private float recargo;
    @JoinColumn(name = "codArticulo", referencedColumnName = "codArticulo", insertable = false, updatable = false)
    @ManyToOne
    private Articulo articulo;
    @JoinColumn(name = "codVenta", referencedColumnName = "codVenta", insertable = false, updatable = false)
    @ManyToOne
    private Venta venta;

    public LineaVenta() {
    }

    public LineaVenta(LineaVentaPK lineaVentaPK) {
        this.lineaVentaPK = lineaVentaPK;
    }

    public LineaVenta(LineaVentaPK lineaVentaPK, int cantidad, float iva, float recargo) {
        this.lineaVentaPK = lineaVentaPK;
        this.cantidad = cantidad;
        this.iva = iva;
        this.recargo = recargo;
    }

    public LineaVenta(String codVenta, String codArticulo) {
        this.lineaVentaPK = new LineaVentaPK(codVenta, codArticulo);
    }

    public LineaVentaPK getLineaVentaPK() {
        return lineaVentaPK;
    }

    public void setLineaVentaPK(LineaVentaPK lineaVentaPK) {
        this.lineaVentaPK = lineaVentaPK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Float subTotal) {
        this.subTotal = subTotal;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getRecargo() {
        return recargo;
    }

    public void setRecargo(float recargo) {
        this.recargo = recargo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lineaVentaPK != null ? lineaVentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LineaVenta)) {
            return false;
        }
        LineaVenta other = (LineaVenta) object;
        if ((this.lineaVentaPK == null && other.lineaVentaPK != null) || (this.lineaVentaPK != null && !this.lineaVentaPK.equals(other.lineaVentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.LineaVenta[lineaVentaPK=" + lineaVentaPK + "]";
    }

}
