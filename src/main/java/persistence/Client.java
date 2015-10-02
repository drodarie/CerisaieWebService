package persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Dimitri on 02/10/2015.
 *
 * @version 1.0
 */
@Entity
public class Client {
    private int numCli;
    private String nomCli;
    private String adrRueCli;
    private String cpCli;
    private String villeCli;
    private String pieceCli;
    private String numPieceCli;

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
    public String getCpCli() {
        return cpCli;
    }

    public void setCpCli(String cpCli) {
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
    public String getNumPieceCli() {
        return numPieceCli;
    }

    public void setNumPieceCli(String numPieceCli) {
        this.numPieceCli = numPieceCli;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (numCli != client.numCli) return false;
        if (nomCli != null ? !nomCli.equals(client.nomCli) : client.nomCli != null) return false;
        if (adrRueCli != null ? !adrRueCli.equals(client.adrRueCli) : client.adrRueCli != null) return false;
        if (cpCli != null ? !cpCli.equals(client.cpCli) : client.cpCli != null) return false;
        if (villeCli != null ? !villeCli.equals(client.villeCli) : client.villeCli != null) return false;
        if (pieceCli != null ? !pieceCli.equals(client.pieceCli) : client.pieceCli != null) return false;
        if (numPieceCli != null ? !numPieceCli.equals(client.numPieceCli) : client.numPieceCli != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numCli;
        result = 31 * result + (nomCli != null ? nomCli.hashCode() : 0);
        result = 31 * result + (adrRueCli != null ? adrRueCli.hashCode() : 0);
        result = 31 * result + (cpCli != null ? cpCli.hashCode() : 0);
        result = 31 * result + (villeCli != null ? villeCli.hashCode() : 0);
        result = 31 * result + (pieceCli != null ? pieceCli.hashCode() : 0);
        result = 31 * result + (numPieceCli != null ? numPieceCli.hashCode() : 0);
        return result;
    }
}
