/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistenciaBD;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author genar
 */
@Embeddable
public class ContactoPK implements Serializable {
    @Column(name = "codCliente", nullable = false)
    private String codCliente;
    @Column(name = "idContacto", nullable = false)
    private String idContacto;

    public ContactoPK() {
    }

    public ContactoPK(String codCliente, String idContacto) {
        this.codCliente = codCliente;
        this.idContacto = idContacto;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(String idContacto) {
        this.idContacto = idContacto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCliente != null ? codCliente.hashCode() : 0);
        hash += (idContacto != null ? idContacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactoPK)) {
            return false;
        }
        ContactoPK other = (ContactoPK) object;
        if ((this.codCliente == null && other.codCliente != null) || (this.codCliente != null && !this.codCliente.equals(other.codCliente))) {
            return false;
        }
        if ((this.idContacto == null && other.idContacto != null) || (this.idContacto != null && !this.idContacto.equals(other.idContacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.ContactoPK[codCliente=" + codCliente + ", idContacto=" + idContacto + "]";
    }

}
