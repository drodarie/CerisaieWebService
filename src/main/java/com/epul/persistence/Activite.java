package com.epul.persistence;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Toromis on 24/10/2015.
 */
@Entity
@IdClass(ActivitePK.class)
public class Activite {
    private int codeSport;
    private Timestamp dateJour;
    private int numSej;
    private int nbloc;

    @Id
    @Column(name = "CodeSport")
    public int getCodeSport() {
        return codeSport;
    }

    public void setCodeSport(int codeSport) {
        this.codeSport = codeSport;
    }

    @Id
    @Column(name = "DateJour")
    public Timestamp getDateJour() {
        return dateJour;
    }

    public void setDateJour(Timestamp dateJour) {
        this.dateJour = dateJour;
    }

    @Id
    @Column(name = "NumSej")
    public int getNumSej() {
        return numSej;
    }

    public void setNumSej(int numSej) {
        this.numSej = numSej;
    }

    @Basic
    @Column(name = "NBLOC")
    public int getNbloc() {
        return nbloc;
    }

    public void setNbloc(int nbloc) {
        this.nbloc = nbloc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activite activite = (Activite) o;

        if (codeSport != activite.codeSport) return false;
        if (numSej != activite.numSej) return false;
        if (nbloc != activite.nbloc) return false;
        if (dateJour != null ? !dateJour.equals(activite.dateJour) : activite.dateJour != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeSport;
        result = 31 * result + (dateJour != null ? dateJour.hashCode() : 0);
        result = 31 * result + numSej;
        result = 31 * result + nbloc;
        return result;
    }
}
