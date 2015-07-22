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
public class LineaReservaPK implements Serializable {
    @Column(name = "codReserva", nullable = false)
    private String codReserva;
    @Column(name = "codArticulo", nullable = false)
    private String codArticulo;

    public LineaReservaPK() {
    }

    public LineaReservaPK(String codReserva, String codArticulo) {
        this.codReserva = codReserva;
        this.codArticulo = codArticulo;
    }

    public String getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(String codReserva) {
        this.codReserva = codReserva;
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
        hash += (codReserva != null ? codReserva.hashCode() : 0);
        hash += (codArticulo != null ? codArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LineaReservaPK)) {
            return false;
        }
        LineaReservaPK other = (LineaReservaPK) object;
        if ((this.codReserva == null && other.codReserva != null) || (this.codReserva != null && !this.codReserva.equals(other.codReserva))) {
            return false;
        }
        if ((this.codArticulo == null && other.codArticulo != null) || (this.codArticulo != null && !this.codArticulo.equals(other.codArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.LineaReservaPK[codReserva=" + codReserva + ", codArticulo=" + codArticulo + "]";
    }

}
