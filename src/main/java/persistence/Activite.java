package persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by Dimitri on 02/10/2015.
 *
 * @version 1.0
 */
@Entity
public class Activite {
    private int idActivite;
    private Date dateJour;
    private Integer nbloc;

    @Id
    @Column(name = "IdActivite")
    public int getIdActivite() {
        return idActivite;
    }

    public void setIdActivite(int idActivite) {
        this.idActivite = idActivite;
    }

    @Basic
    @Column(name = "DateJour")
    public Date getDateJour() {
        return dateJour;
    }

    public void setDateJour(Date dateJour) {
        this.dateJour = dateJour;
    }

    @Basic
    @Column(name = "NBLOC")
    public Integer getNbloc() {
        return nbloc;
    }

    public void setNbloc(Integer nbloc) {
        this.nbloc = nbloc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activite activite = (Activite) o;

        if (idActivite != activite.idActivite) return false;
        if (dateJour != null ? !dateJour.equals(activite.dateJour) : activite.dateJour != null) return false;
        if (nbloc != null ? !nbloc.equals(activite.nbloc) : activite.nbloc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idActivite;
        result = 31 * result + (dateJour != null ? dateJour.hashCode() : 0);
        result = 31 * result + (nbloc != null ? nbloc.hashCode() : 0);
        return result;
    }
}
