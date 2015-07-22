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
public class LineaPedidoPK implements Serializable {
    @Column(name = "codPedido", nullable = false)
    private String codPedido;
    @Column(name = "codArticulo", nullable = false)
    private String codArticulo;

    public LineaPedidoPK() {
    }

    public LineaPedidoPK(String codPedido, String codArticulo) {
        this.codPedido = codPedido;
        this.codArticulo = codArticulo;
    }

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

    public String getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(String codArticulo) {
        this.codArticulo = codArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPedido != null ? codPedido.hashCode() : 0);
        hash += (codArticulo != null ? codArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LineaPedidoPK)) {
            return false;
        }
        LineaPedidoPK other = (LineaPedidoPK) object;
        if ((this.codPedido == null && other.codPedido != null) || (this.codPedido != null && !this.codPedido.equals(other.codPedido))) {
            return false;
        }
        if ((this.codArticulo == null && other.codArticulo != null) || (this.codArticulo != null && !this.codArticulo.equals(other.codArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.LineaPedidoPK[codPedido=" + codPedido + ", codArticulo=" + codArticulo + "]";
    }

}
