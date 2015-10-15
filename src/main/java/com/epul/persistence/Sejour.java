package com.epul.persistence;

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
public class Sejour {
    private int numSej;
    private Date dateDebSej;
    private Date dateFinSej;
    private Integer nbPersonnes;

    @Id
    @Column(name = "NumSej")
    public int getNumSej() {
        return numSej;
    }

    public void setNumSej(int numSej) {
        this.numSej = numSej;
    }

    @Basic
    @Column(name = "DateDebSej")
    public Date getDateDebSej() {
        return dateDebSej;
    }

    public void setDateDebSej(Date dateDebSej) {
        this.dateDebSej = dateDebSej;
    }

    @Basic
    @Column(name = "DateFinSej")
    public Date getDateFinSej() {
        return dateFinSej;
    }

    public void setDateFinSej(Date dateFinSej) {
        this.dateFinSej = dateFinSej;
    }

    @Basic
    @Column(name = "NbPersonnes")
    public Integer getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(Integer nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sejour sejour = (Sejour) o;

        if (numSej != sejour.numSej) return false;
        if (dateDebSej != null ? !dateDebSej.equals(sejour.dateDebSej) : sejour.dateDebSej != null) return false;
        if (dateFinSej != null ? !dateFinSej.equals(sejour.dateFinSej) : sejour.dateFinSej != null) return false;
        if (nbPersonnes != null ? !nbPersonnes.equals(sejour.nbPersonnes) : sejour.nbPersonnes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numSej;
        result = 31 * result + (dateDebSej != null ? dateDebSej.hashCode() : 0);
        result = 31 * result + (dateFinSej != null ? dateFinSej.hashCode() : 0);
        result = 31 * result + (nbPersonnes != null ? nbPersonnes.hashCode() : 0);
        return result;
    }
}
