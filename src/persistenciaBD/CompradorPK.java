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
public class CompradorPK implements Serializable {
    @Column(name = "codCliente", nullable = false)
    private String codCliente;
    @Column(name = "idComprador", nullable = false)
    private String idComprador;

    public CompradorPK() {
    }

    public CompradorPK(String codCliente, String idComprador) {
        this.codCliente = codCliente;
        this.idComprador = idComprador;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(String idComprador) {
        this.idComprador = idComprador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCliente != null ? codCliente.hashCode() : 0);
        hash += (idComprador != null ? idComprador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompradorPK)) {
            return false;
        }
        CompradorPK other = (CompradorPK) object;
        if ((this.codCliente == null && other.codCliente != null) || (this.codCliente != null && !this.codCliente.equals(other.codCliente))) {
            return false;
        }
        if ((this.idComprador == null && other.idComprador != null) || (this.idComprador != null && !this.idComprador.equals(other.idComprador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.CompradorPK[codCliente=" + codCliente + ", idComprador=" + idComprador + "]";
    }

}
