package com.epul.persistence;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Toromis on 24/10/2015.
 */
@Entity
public class Sejour {
    private int numSej;
    private int numCli;
    private int numEmpl;
    private Timestamp datedebSej;
    private Timestamp dateFinSej;
    private int nbPersonnes;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
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

    @Basic
    @Column(name = "NumEmpl")
    public int getNumEmpl() {
        return numEmpl;
    }

    public void setNumEmpl(int numEmpl) {
        this.numEmpl = numEmpl;
    }

    @Basic
    @Column(name = "NumCli")
    public int getNumCli() {
        return numCli;
    }

    public void setNumCli(int numCli) {
        this.numCli = numCli;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sejour sejour = (Sejour) o;

        return numSej == sejour.numSej &&
                numCli == sejour.numCli &&
                numEmpl == sejour.numEmpl &&
                nbPersonnes == sejour.nbPersonnes &&
                !(datedebSej != null ? !datedebSej.equals(sejour.datedebSej) : sejour.datedebSej != null) &&
                !(dateFinSej != null ? !dateFinSej.equals(sejour.dateFinSej) : sejour.dateFinSej != null);

    }

    @Override
    public int hashCode() {
        int result = numSej;
        result = 31 * result + numCli;
        result = 31 * result + numEmpl;
        result = 31 * result + (datedebSej != null ? datedebSej.hashCode() : 0);
        result = 31 * result + (dateFinSej != null ? dateFinSej.hashCode() : 0);
        result = 31 * result + nbPersonnes;
        return result;
    }
}
