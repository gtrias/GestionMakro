/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author genar
 */
@Entity
@Table(name = "empleado")
@NamedQueries({@NamedQuery(name = "Empleado.findByCodEmpleado", query = "SELECT e FROM Empleado e WHERE e.codEmpleado = :codEmpleado"), @NamedQuery(name = "Empleado.findByLogin", query = "SELECT e FROM Empleado e WHERE e.login = :login"), @NamedQuery(name = "Empleado.findByContrasena", query = "SELECT e FROM Empleado e WHERE e.contrasena = :contrasena")})
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codEmpleado", nullable = false)
    private String codEmpleado;
    @Column(name = "login", nullable = false)
    private String login;
    @Column(name = "contrasena", nullable = false)
    private String contrasena;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codEmpleado")
    private Collection<Venta> ventaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codEmpleado")
    private Collection<Pedido> pedidoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codEmpleado")
    private Collection<Reserva> reservaCollection;

    public Empleado() {
    }

    public Empleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public Empleado(String codEmpleado, String login, String contrasena) {
        this.codEmpleado = codEmpleado;
        this.login = login;
        this.contrasena = contrasena;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Collection<Venta> getVentaCollection() {
        return ventaCollection;
    }

    public void setVentaCollection(Collection<Venta> ventaCollection) {
        this.ventaCollection = ventaCollection;
    }

    public Collection<Pedido> getPedidoCollection() {
        return pedidoCollection;
    }

    public void setPedidoCollection(Collection<Pedido> pedidoCollection) {
        this.pedidoCollection = pedidoCollection;
    }

    public Collection<Reserva> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<Reserva> reservaCollection) {
        this.reservaCollection = reservaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEmpleado != null ? codEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.codEmpleado == null && other.codEmpleado != null) || (this.codEmpleado != null && !this.codEmpleado.equals(other.codEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.Empleado[codEmpleado=" + codEmpleado + "]";
    }

}
