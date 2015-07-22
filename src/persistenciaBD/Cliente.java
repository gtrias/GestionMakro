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
@Table(name = "cliente")
@NamedQueries({@NamedQuery(name = "Cliente.findByCodCliente", query = "SELECT c FROM Cliente c WHERE c.codCliente = :codCliente"), @NamedQuery(name = "Cliente.findByNif", query = "SELECT c FROM Cliente c WHERE c.nif = :nif"), @NamedQuery(name = "Cliente.findByNombre", query = "SELECT c FROM Cliente c WHERE c.nombre = :nombre"), @NamedQuery(name = "Cliente.findByRecargo", query = "SELECT c FROM Cliente c WHERE c.recargo = :recargo"), @NamedQuery(name = "Cliente.findByFechaAlta", query = "SELECT c FROM Cliente c WHERE c.fechaAlta = :fechaAlta"), @NamedQuery(name = "Cliente.findByDireccion", query = "SELECT c FROM Cliente c WHERE c.direccion = :direccion"), @NamedQuery(name = "Cliente.findByCodigoPostal", query = "SELECT c FROM Cliente c WHERE c.codigoPostal = :codigoPostal"), @NamedQuery(name = "Cliente.findByMensajeBloque", query = "SELECT c FROM Cliente c WHERE c.mensajeBloque = :mensajeBloque")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codCliente", nullable = false)
    private String codCliente;
    @Column(name = "NIF", nullable = false)
    private String nif;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "recargo", nullable = false)
    private boolean recargo;
    @Column(name = "fechaAlta", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "codigoPostal", nullable = false)
    private String codigoPostal;
    @Column(name = "mensajeBloque")
    private String mensajeBloque;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCliente")
    private Collection<Venta> ventaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private Collection<Contacto> contactoCollection;
    @JoinColumn(name = "codTipo", referencedColumnName = "codTipo")
    @ManyToOne
    private TiposCliente codTipo;
    @JoinColumn(name = "codActividad", referencedColumnName = "codActividad")
    @ManyToOne
    private Actividades codActividad;
    @JoinColumn(name = "codBloqueo", referencedColumnName = "tipo")
    @ManyToOne
    private Bloqueo codBloqueo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private Collection<Comprador> compradorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCliente")
    private Collection<Reserva> reservaCollection;

    public Cliente() {
    }

    public Cliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public Cliente(String codCliente, String nif, String nombre, boolean recargo, Date fechaAlta, String direccion, String codigoPostal) {
        this.codCliente = codCliente;
        this.nif = nif;
        this.nombre = nombre;
        this.recargo = recargo;
        this.fechaAlta = fechaAlta;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getRecargo() {
        return recargo;
    }

    public void setRecargo(boolean recargo) {
        this.recargo = recargo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getMensajeBloque() {
        return mensajeBloque;
    }

    public void setMensajeBloque(String mensajeBloque) {
        this.mensajeBloque = mensajeBloque;
    }

    public Collection<Venta> getVentaCollection() {
        return ventaCollection;
    }

    public void setVentaCollection(Collection<Venta> ventaCollection) {
        this.ventaCollection = ventaCollection;
    }

    public Collection<Contacto> getContactoCollection() {
        return contactoCollection;
    }

    public void setContactoCollection(Collection<Contacto> contactoCollection) {
        this.contactoCollection = contactoCollection;
    }

    public TiposCliente getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(TiposCliente codTipo) {
        this.codTipo = codTipo;
    }

    public Actividades getCodActividad() {
        return codActividad;
    }

    public void setCodActividad(Actividades codActividad) {
        this.codActividad = codActividad;
    }

    public Bloqueo getCodBloqueo() {
        return codBloqueo;
    }

    public void setCodBloqueo(Bloqueo codBloqueo) {
        this.codBloqueo = codBloqueo;
    }

    public Collection<Comprador> getCompradorCollection() {
        return compradorCollection;
    }

    public void setCompradorCollection(Collection<Comprador> compradorCollection) {
        this.compradorCollection = compradorCollection;
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
        hash += (codCliente != null ? codCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codCliente == null && other.codCliente != null) || (this.codCliente != null && !this.codCliente.equals(other.codCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.Cliente[codCliente=" + codCliente + "]";
    }

}
