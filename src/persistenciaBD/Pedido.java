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
@Table(name = "pedido")
@NamedQueries({@NamedQuery(name = "Pedido.findByCodPedido", query = "SELECT p FROM Pedido p WHERE p.codPedido = :codPedido"), @NamedQuery(name = "Pedido.findByFecha", query = "SELECT p FROM Pedido p WHERE p.fecha = :fecha"), @NamedQuery(name = "Pedido.findByServido", query = "SELECT p FROM Pedido p WHERE p.servido = :servido"), @NamedQuery(name = "Pedido.findByAceptado", query = "SELECT p FROM Pedido p WHERE p.aceptado = :aceptado")})
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codPedido", nullable = false)
    private String codPedido;
    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "servido", nullable = false)
    private boolean servido;
    @Column(name = "aceptado", nullable = false)
    private boolean aceptado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
    private Collection<LineaPedido> lineaPedidoCollection;
    @JoinColumn(name = "codEmpleado", referencedColumnName = "codEmpleado")
    @ManyToOne
    private Empleado codEmpleado;
    @JoinColumn(name = "codReserva", referencedColumnName = "codReserva")
    @ManyToOne
    private Reserva codReserva;

    public Pedido() {
    }

    public Pedido(String codPedido) {
        this.codPedido = codPedido;
    }

    public Pedido(String codPedido, Date fecha, boolean servido, boolean aceptado) {
        this.codPedido = codPedido;
        this.fecha = fecha;
        this.servido = servido;
        this.aceptado = aceptado;
    }

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean getServido() {
        return servido;
    }

    public void setServido(boolean servido) {
        this.servido = servido;
    }

    public boolean getAceptado() {
        return aceptado;
    }

    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }

    public Collection<LineaPedido> getLineaPedidoCollection() {
        return lineaPedidoCollection;
    }

    public void setLineaPedidoCollection(Collection<LineaPedido> lineaPedidoCollection) {
        this.lineaPedidoCollection = lineaPedidoCollection;
    }

    public Empleado getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(Empleado codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public Reserva getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(Reserva codReserva) {
        this.codReserva = codReserva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPedido != null ? codPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.codPedido == null && other.codPedido != null) || (this.codPedido != null && !this.codPedido.equals(other.codPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.Pedido[codPedido=" + codPedido + "]";
    }

}
