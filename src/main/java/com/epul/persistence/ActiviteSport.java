package com.epul.persistence;

import javax.persistence.Column;
import java.sql.Timestamp;

/**
 * @Author Dimitri on 09/01/2016.
 * @Version 1.0
 */
public class ActiviteSport {
    private Sport sport;
    private Timestamp dateJour;
    private int numSej;
    private int nbloc;

    public ActiviteSport(Activite activite, Sport sport) {
        this.sport = sport;
        this.dateJour = activite.getDateJour();
        this.numSej = activite.getNumSej();
        this.nbloc = activite.getNbloc();
    }

    @Column(name = "Sport")
    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @Column(name = "DateJour")
    public Timestamp getDateJour() {
        return dateJour;
    }

    public void setDateJour(Timestamp dateJour) {
        this.dateJour = dateJour;
    }

    @Column(name = "NumSej")
    public int getNumSej() {
        return numSej;
    }

    public void setNumSej(int numSej) {
        this.numSej = numSej;
    }

    @Column(name = "NbBloc")
    public int getNbloc() {
        return nbloc;
    }

    public void setNbloc(int nbloc) {
        this.nbloc = nbloc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ActiviteSport)) return false;

        ActiviteSport that = (ActiviteSport) o;

        return getNumSej() == that.getNumSej() &&
                getNbloc() == that.getNbloc() &&
                (getSport() != null ?
                        getSport().equals(that.getSport()) :
                        that.getSport() == null &&
                                getDateJour().equals(that.getDateJour()));

    }

    @Override
    public int hashCode() {
        int result = getSport() != null ? getSport().hashCode() : 0;
        result = 31 * result + getDateJour().hashCode();
        result = 31 * result + getNumSej();
        result = 31 * result + getNbloc();
        return result;
    }
}
