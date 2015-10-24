package com.epul.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Toromis on 24/10/2015.
 */
@Entity
public class Client {
    private int numCli;
    private String nomCli;
    private String adrRueCli;
    private int cpCli;
    private String villeCli;
    private String pieceCli;
    private int numPieceCli;

    public Client() {
        numCli=0;
        nomCli="";
        adrRueCli="";
        cpCli=0;
        villeCli="";
        pieceCli="";
        numPieceCli=0;
    }

    public Client(String nomCli, String adrRueCli, int cpCli, String villeCli, String pieceCli, int numPieceCli) {
        this.nomCli = nomCli;
        this.adrRueCli = adrRueCli;
        this.cpCli = cpCli;
        this.villeCli = villeCli;
        this.pieceCli = pieceCli;
        this.numPieceCli = numPieceCli;
    }

    @Id
    @Column(name = "NumCli")
    public int getNumCli() {
        return numCli;
    }

    public void setNumCli(int numCli) {
        this.numCli = numCli;
    }

    @Basic
    @Column(name = "NomCli")
    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    @Basic
    @Column(name = "AdrRueCli")
    public String getAdrRueCli() {
        return adrRueCli;
    }

    public void setAdrRueCli(String adrRueCli) {
        this.adrRueCli = adrRueCli;
    }

    @Basic
    @Column(name = "CpCli")
    public int getCpCli() {
        return cpCli;
    }

    public void setCpCli(int cpCli) {
        this.cpCli = cpCli;
    }

    @Basic
    @Column(name = "VilleCli")
    public String getVilleCli() {
        return villeCli;
    }

    public void setVilleCli(String villeCli) {
        this.villeCli = villeCli;
    }

    @Basic
    @Column(name = "PieceCli")
    public String getPieceCli() {
        return pieceCli;
    }

    public void setPieceCli(String pieceCli) {
        this.pieceCli = pieceCli;
    }

    @Basic
    @Column(name = "NumPieceCli")
    public int getNumPieceCli() {
        return numPieceCli;
    }

    public void setNumPieceCli(int numPieceCli) {
        this.numPieceCli = numPieceCli;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (numCli != client.numCli) return false;
        if (cpCli != client.cpCli) return false;
        if (numPieceCli != client.numPieceCli) return false;
        if (nomCli != null ? !nomCli.equals(client.nomCli) : client.nomCli != null) return false;
        if (adrRueCli != null ? !adrRueCli.equals(client.adrRueCli) : client.adrRueCli != null) return false;
        if (villeCli != null ? !villeCli.equals(client.villeCli) : client.villeCli != null) return false;
        if (pieceCli != null ? !pieceCli.equals(client.pieceCli) : client.pieceCli != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numCli;
        result = 31 * result + (nomCli != null ? nomCli.hashCode() : 0);
        result = 31 * result + (adrRueCli != null ? adrRueCli.hashCode() : 0);
        result = 31 * result + cpCli;
        result = 31 * result + (villeCli != null ? villeCli.hashCode() : 0);
        result = 31 * result + (pieceCli != null ? pieceCli.hashCode() : 0);
        result = 31 * result + numPieceCli;
        return result;
    }
}
