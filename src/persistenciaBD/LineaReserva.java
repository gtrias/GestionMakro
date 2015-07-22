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
@Table(name = "lineaReserva")
@NamedQueries({@NamedQuery(name = "LineaReserva.findByCodReserva", query = "SELECT l FROM LineaReserva l WHERE l.lineaReservaPK.codReserva = :codReserva"), @NamedQuery(name = "LineaReserva.findByCodArticulo", query = "SELECT l FROM LineaReserva l WHERE l.lineaReservaPK.codArticulo = :codArticulo"), @NamedQuery(name = "LineaReserva.findByCantidad", query = "SELECT l FROM LineaReserva l WHERE l.cantidad = :cantidad"), @NamedQuery(name = "LineaReserva.findBySubTotal", query = "SELECT l FROM LineaReserva l WHERE l.subTotal = :subTotal"), @NamedQuery(name = "LineaReserva.findByIva", query = "SELECT l FROM LineaReserva l WHERE l.iva = :iva"), @NamedQuery(name = "LineaReserva.findByRecargo", query = "SELECT l FROM LineaReserva l WHERE l.recargo = :recargo")})
public class LineaReserva implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LineaReservaPK lineaReservaPK;
    @Column(name = "cantidad", nullable = false)
    private long cantidad;
    @Column(name = "subTotal")
    private Float subTotal;
    @Column(name = "iva", nullable = false)
    private float iva;
    @Column(name = "recargo", nullable = false)
    private float recargo;
    @JoinColumn(name = "codArticulo", referencedColumnName = "codArticulo", insertable = false, updatable = false)
    @ManyToOne
    private Articulo articulo;
    @JoinColumn(name = "codReserva", referencedColumnName = "codReserva", insertable = false, updatable = false)
    @ManyToOne
    private Reserva reserva;

    public LineaReserva() {
    }

    public LineaReserva(LineaReservaPK lineaReservaPK) {
        this.lineaReservaPK = lineaReservaPK;
    }

    public LineaReserva(LineaReservaPK lineaReservaPK, long cantidad, float iva, float recargo) {
        this.lineaReservaPK = lineaReservaPK;
        this.cantidad = cantidad;
        this.iva = iva;
        this.recargo = recargo;
    }

    public LineaReserva(String codReserva, String codArticulo) {
        this.lineaReservaPK = new LineaReservaPK(codReserva, codArticulo);
    }

    public LineaReservaPK getLineaReservaPK() {
        return lineaReservaPK;
    }

    public void setLineaReservaPK(LineaReservaPK lineaReservaPK) {
        this.lineaReservaPK = lineaReservaPK;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
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

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lineaReservaPK != null ? lineaReservaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LineaReserva)) {
            return false;
        }
        LineaReserva other = (LineaReserva) object;
        if ((this.lineaReservaPK == null && other.lineaReservaPK != null) || (this.lineaReservaPK != null && !this.lineaReservaPK.equals(other.lineaReservaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.LineaReserva[lineaReservaPK=" + lineaReservaPK + "]";
    }

}
