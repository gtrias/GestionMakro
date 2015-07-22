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
@Table(name = "lineaPedido")
@NamedQueries({@NamedQuery(name = "LineaPedido.findByCodPedido", query = "SELECT l FROM LineaPedido l WHERE l.lineaPedidoPK.codPedido = :codPedido"), @NamedQuery(name = "LineaPedido.findByCodArticulo", query = "SELECT l FROM LineaPedido l WHERE l.lineaPedidoPK.codArticulo = :codArticulo"), @NamedQuery(name = "LineaPedido.findByCantidad", query = "SELECT l FROM LineaPedido l WHERE l.cantidad = :cantidad")})
public class LineaPedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LineaPedidoPK lineaPedidoPK;
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    @JoinColumn(name = "codArticulo", referencedColumnName = "codArticulo", insertable = false, updatable = false)
    @ManyToOne
    private Articulo articulo;
    @JoinColumn(name = "codPedido", referencedColumnName = "codPedido", insertable = false, updatable = false)
    @ManyToOne
    private Pedido pedido;

    public LineaPedido() {
    }

    public LineaPedido(LineaPedidoPK lineaPedidoPK) {
        this.lineaPedidoPK = lineaPedidoPK;
    }

    public LineaPedido(LineaPedidoPK lineaPedidoPK, int cantidad) {
        this.lineaPedidoPK = lineaPedidoPK;
        this.cantidad = cantidad;
    }

    public LineaPedido(String codPedido, String codArticulo) {
        this.lineaPedidoPK = new LineaPedidoPK(codPedido, codArticulo);
    }

    public LineaPedidoPK getLineaPedidoPK() {
        return lineaPedidoPK;
    }

    public void setLineaPedidoPK(LineaPedidoPK lineaPedidoPK) {
        this.lineaPedidoPK = lineaPedidoPK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lineaPedidoPK != null ? lineaPedidoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LineaPedido)) {
            return false;
        }
        LineaPedido other = (LineaPedido) object;
        if ((this.lineaPedidoPK == null && other.lineaPedidoPK != null) || (this.lineaPedidoPK != null && !this.lineaPedidoPK.equals(other.lineaPedidoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.LineaPedido[lineaPedidoPK=" + lineaPedidoPK + "]";
    }

}
