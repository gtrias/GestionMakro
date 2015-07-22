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
@Table(name = "tiposCliente")
@NamedQueries({@NamedQuery(name = "TiposCliente.findByCodTipo", query = "SELECT t FROM TiposCliente t WHERE t.codTipo = :codTipo"), @NamedQuery(name = "TiposCliente.findByNombre", query = "SELECT t FROM TiposCliente t WHERE t.nombre = :nombre"), @NamedQuery(name = "TiposCliente.findByDescripcion", query = "SELECT t FROM TiposCliente t WHERE t.descripcion = :descripcion")})
public class TiposCliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codTipo", nullable = false)
    private String codTipo;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codTipo")
    private Collection<Cliente> clienteCollection;

    public TiposCliente() {
    }

    public TiposCliente(String codTipo) {
        this.codTipo = codTipo;
    }

    public TiposCliente(String codTipo, String nombre, String descripcion) {
        this.codTipo = codTipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(String codTipo) {
        this.codTipo = codTipo;
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

    public Collection<Cliente> getClienteCollection() {
        return clienteCollection;
    }

    public void setClienteCollection(Collection<Cliente> clienteCollection) {
        this.clienteCollection = clienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTipo != null ? codTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposCliente)) {
            return false;
        }
        TiposCliente other = (TiposCliente) object;
        if ((this.codTipo == null && other.codTipo != null) || (this.codTipo != null && !this.codTipo.equals(other.codTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.TiposCliente[codTipo=" + codTipo + "]";
    }

}
