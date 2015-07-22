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
@Table(name = "contacto")
@NamedQueries({@NamedQuery(name = "Contacto.findByCodCliente", query = "SELECT c FROM Contacto c WHERE c.contactoPK.codCliente = :codCliente"), @NamedQuery(name = "Contacto.findByIdContacto", query = "SELECT c FROM Contacto c WHERE c.contactoPK.idContacto = :idContacto"), @NamedQuery(name = "Contacto.findByTipo", query = "SELECT c FROM Contacto c WHERE c.tipo = :tipo"), @NamedQuery(name = "Contacto.findByValor", query = "SELECT c FROM Contacto c WHERE c.valor = :valor"), @NamedQuery(name = "Contacto.findByPermiso", query = "SELECT c FROM Contacto c WHERE c.permiso = :permiso")})
public class Contacto implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContactoPK contactoPK;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "valor")
    private String valor;
    @Column(name = "permiso")
    private Boolean permiso;
    @JoinColumn(name = "codCliente", referencedColumnName = "codCliente", insertable = false, updatable = false)
    @ManyToOne
    private Cliente cliente;

    public Contacto() {
    }

    public Contacto(ContactoPK contactoPK) {
        this.contactoPK = contactoPK;
    }

    public Contacto(String codCliente, String idContacto) {
        this.contactoPK = new ContactoPK(codCliente, idContacto);
    }

    public ContactoPK getContactoPK() {
        return contactoPK;
    }

    public void setContactoPK(ContactoPK contactoPK) {
        this.contactoPK = contactoPK;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Boolean getPermiso() {
        return permiso;
    }

    public void setPermiso(Boolean permiso) {
        this.permiso = permiso;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactoPK != null ? contactoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacto)) {
            return false;
        }
        Contacto other = (Contacto) object;
        if ((this.contactoPK == null && other.contactoPK != null) || (this.contactoPK != null && !this.contactoPK.equals(other.contactoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.Contacto[contactoPK=" + contactoPK + "]";
    }

}
