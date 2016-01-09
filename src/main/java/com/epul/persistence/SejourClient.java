package com.epul.persistence;

import javax.persistence.Column;
import java.sql.Timestamp;

/**
 * @Author Dimitri on 09/01/2016.
 * @Version 1.0
 */

public class SejourClient {
    private Client client;
    private int numSej;
    private int numEmpl;
    private Timestamp datedebSej;
    private Timestamp dateFinSej;
    private int nbPersonnes;

    public SejourClient(Sejour sejour, Client client) {
        this.client = client;
        this.numSej = sejour.getNumSej();
        this.numEmpl = sejour.getNumEmpl();
        this.datedebSej = sejour.getDatedebSej();
        this.dateFinSej = sejour.getDateFinSej();
        this.nbPersonnes = sejour.getNbPersonnes();
    }

    @Column(name = "NumSej")
    public int getNumSej() {
        return numSej;
    }

    public void setNumSej(int numSej) {
        this.numSej = numSej;
    }

    @Column(name = "NumEmpl")
    public int getNumEmpl() {
        return numEmpl;
    }

    public void setNumEmpl(int numEmpl) {
        this.numEmpl = numEmpl;
    }

    @Column(name = "DatedebSej")
    public Timestamp getDatedebSej() {
        return datedebSej;
    }

    public void setDatedebSej(Timestamp datedebSej) {
        this.datedebSej = datedebSej;
    }

    @Column(name = "DateFinSej")
    public Timestamp getDateFinSej() {
        return dateFinSej;
    }

    public void setDateFinSej(Timestamp dateFinSej) {
        this.dateFinSej = dateFinSej;
    }

    @Column(name = "NbPersonnes")
    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    @Column(name = "Client")
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SejourClient)) return false;

        SejourClient that = (SejourClient) o;

        if (getNumSej() != that.getNumSej()) return false;
        if (getNumEmpl() != that.getNumEmpl()) return false;
        if (getNbPersonnes() != that.getNbPersonnes()) return false;
        if (getDatedebSej() != null ? !getDatedebSej().equals(that.getDatedebSej()) : that.getDatedebSej() != null)
            return false;
        if (getDateFinSej() != null ? !getDateFinSej().equals(that.getDateFinSej()) : that.getDateFinSej() != null)
            return false;
        return getClient().equals(that.getClient());

    }

    @Override
    public int hashCode() {
        int result = getNumSej();
        result = 31 * result + getNumEmpl();
        result = 31 * result + (getDatedebSej() != null ? getDatedebSej().hashCode() : 0);
        result = 31 * result + (getDateFinSej() != null ? getDateFinSej().hashCode() : 0);
        result = 31 * result + getNbPersonnes();
        result = 31 * result + getClient().hashCode();
        return result;
    }
}
