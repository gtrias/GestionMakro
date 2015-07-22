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
@Table(name = "comprador")
@NamedQueries({@NamedQuery(name = "Comprador.findByCodCliente", query = "SELECT c FROM Comprador c WHERE c.compradorPK.codCliente = :codCliente"), @NamedQuery(name = "Comprador.findByIdComprador", query = "SELECT c FROM Comprador c WHERE c.compradorPK.idComprador = :idComprador"), @NamedQuery(name = "Comprador.findByNombre", query = "SELECT c FROM Comprador c WHERE c.nombre = :nombre"), @NamedQuery(name = "Comprador.findByApellidos", query = "SELECT c FROM Comprador c WHERE c.apellidos = :apellidos"), @NamedQuery(name = "Comprador.findByTelefono", query = "SELECT c FROM Comprador c WHERE c.telefono = :telefono"), @NamedQuery(name = "Comprador.findByMovil", query = "SELECT c FROM Comprador c WHERE c.movil = :movil"), @NamedQuery(name = "Comprador.findByFax", query = "SELECT c FROM Comprador c WHERE c.fax = :fax"), @NamedQuery(name = "Comprador.findByEmail", query = "SELECT c FROM Comprador c WHERE c.email = :email")})
public class Comprador implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompradorPK compradorPK;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "movil")
    private String movil;
    @Column(name = "fax")
    private String fax;
    @Column(name = "email")
    private String email;
    @JoinColumn(name = "codCliente", referencedColumnName = "codCliente", insertable = false, updatable = false)
    @ManyToOne
    private Cliente cliente;

    public Comprador() {
    }

    public Comprador(CompradorPK compradorPK) {
        this.compradorPK = compradorPK;
    }

    public Comprador(String codCliente, String idComprador) {
        this.compradorPK = new CompradorPK(codCliente, idComprador);
    }

    public CompradorPK getCompradorPK() {
        return compradorPK;
    }

    public void setCompradorPK(CompradorPK compradorPK) {
        this.compradorPK = compradorPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        hash += (compradorPK != null ? compradorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comprador)) {
            return false;
        }
        Comprador other = (Comprador) object;
        if ((this.compradorPK == null && other.compradorPK != null) || (this.compradorPK != null && !this.compradorPK.equals(other.compradorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistenciaBD.Comprador[compradorPK=" + compradorPK + "]";
    }

}
