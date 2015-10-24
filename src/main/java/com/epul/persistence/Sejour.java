package com.epul.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Toromis on 24/10/2015.
 */
@Entity
public class Sejour {
    private int numSej;
    private Timestamp datedebSej;
    private Timestamp dateFinSej;
    private int nbPersonnes;

    @Id
    @Column(name = "NumSej")
    public int getNumSej() {
        return numSej;
    }

    public void setNumSej(int numSej) {
        this.numSej = numSej;
    }

    @Basic
    @Column(name = "DatedebSej")
    public Timestamp getDatedebSej() {
        return datedebSej;
    }

    public void setDatedebSej(Timestamp datedebSej) {
        this.datedebSej = datedebSej;
    }

    @Basic
    @Column(name = "DateFinSej")
    public Timestamp getDateFinSej() {
        return dateFinSej;
    }

    public void setDateFinSej(Timestamp dateFinSej) {
        this.dateFinSej = dateFinSej;
    }

    @Basic
    @Column(name = "NbPersonnes")
    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sejour sejour = (Sejour) o;

        if (numSej != sejour.numSej) return false;
        if (nbPersonnes != sejour.nbPersonnes) return false;
        if (datedebSej != null ? !datedebSej.equals(sejour.datedebSej) : sejour.datedebSej != null) return false;
        if (dateFinSej != null ? !dateFinSej.equals(sejour.dateFinSej) : sejour.dateFinSej != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numSej;
        result = 31 * result + (datedebSej != null ? datedebSej.hashCode() : 0);
        result = 31 * result + (dateFinSej != null ? dateFinSej.hashCode() : 0);
        result = 31 * result + nbPersonnes;
        return result;
    }
}
