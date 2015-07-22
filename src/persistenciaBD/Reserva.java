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
@Table(name = "reserva")
@NamedQueries({@NamedQuery(name = "Reserva.findByCodReserva", query = "SELECT r FROM Reserva r WHERE r.codReserva = :codReserva"), @NamedQuery(name = "Reserva.findByFecha", query = "SELECT r FROM Reserva r WHERE r.fecha = :fecha"), @NamedQuery(name = "Reserva.findByPendiente", query = "SELECT r FROM Reserva r WHERE r.pendiente = :pendiente"), @NamedQuery(name = "Reserva.findByIva", query = "SELECT r FROM Reserva r WHERE r.iva = :iva"), @NamedQuery(name = "Reserva.findByRecargo", query = "SELECT r FROM Reserva r WHERE r.recargo = :recargo"), @NamedQuery(name = "Reserva.findByTotal", query = "SELECT r FROM Reserva r WHERE r.total = :total")})
public class Reserva implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codReserva", nullable = false)
    private String codReserva;
    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "pendiente", nullable = false)
    private boolean pendiente;
    @Column(name = "iva", nullable = false)
    private float iva;
    @Column(name = "recargo", nullable = false)
    private float recargo;
    @Column(name = "total")
    private Float total;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reserva")
    private Collection<LineaReserva> lineaReservaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codReserva")
    private Collection<Pedido> pedidoCollection;
    @JoinColumn(name = "codCliente", referencedColumnName = "codCliente")
    @ManyToOne
    private Cliente codCliente;
    @JoinColumn(name = "codEmpleado", referencedColumnName = "codEmpleado")
    @ManyToOne
    private Empleado codEmpleado;

    public Reserva() {
    }

    public Reserva(String codReserva) {
        this.codReserva = codReserva;
    }

    public Reserva(String codReserva, Date fecha, boolean pendiente, float iva, float recargo) {
        this.codReserva = codReserva;
        this.fecha = fecha;
        this.pendiente = pendiente;
        this.iva = iva;
        this.recargo = recargo;
    }

    public String getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(String codReserva) {
        this.codReserva = codReserva;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean getPendiente() {
        return pendiente;
    }

    public void setPendiente(boolean pendiente) {
        this.pendiente = pendiente;
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

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Collection<LineaReserva> getLineaReservaCollection() {
        return lineaReservaCollection;
    }

    public void setLineaReservaCollection(Collection<LineaReserva> lineaReservaCollection) {
        this.lineaReservaCollection = lineaReservaCollection;
    }

    public Collection<Pedido> getPedidoCollection() {
        return pedidoCollection;
    }

    public void setPedidoCollection(Collection<Pedido> pedidoCollection) {
        this.pedidoCollection = pedidoCollection;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codReserva != null ? codReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.codReserva == null && other.codReserva != null) || (this.codReserva != null && !this.codReserva.equals(other.codReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.Reserva[codReserva=" + codReserva + "]";
    }

}
