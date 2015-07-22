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
public class LineaVentaPK implements Serializable {
    @Column(name = "codVenta", nullable = false)
    private String codVenta;
    @Column(name = "codArticulo", nullable = false)
    private String codArticulo;

    public LineaVentaPK() {
    }

    public LineaVentaPK(String codVenta, String codArticulo) {
        this.codVenta = codVenta;
        this.codArticulo = codArticulo;
    }

    public String getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(String codVenta) {
        this.codVenta = codVenta;
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
        hash += (codVenta != null ? codVenta.hashCode() : 0);
        hash += (codArticulo != null ? codArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LineaVentaPK)) {
            return false;
        }
        LineaVentaPK other = (LineaVentaPK) object;
        if ((this.codVenta == null && other.codVenta != null) || (this.codVenta != null && !this.codVenta.equals(other.codVenta))) {
            return false;
        }
        if ((this.codArticulo == null && other.codArticulo != null) || (this.codArticulo != null && !this.codArticulo.equals(other.codArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.LineaVentaPK[codVenta=" + codVenta + ", codArticulo=" + codArticulo + "]";
    }

}
