package com.epul.persistence;

import javax.persistence.*;

/**
 * Created by Toromis on 24/10/2015.
 */
@Entity
public class Sport {
    private int codeSport;
    private String libelleSport;
    private String uniteTpsSport;
    private int tarifUnite;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "CodeSport")
    public int getCodeSport() {
        return codeSport;
    }

    public void setCodeSport(int codeSport) {
        this.codeSport = codeSport;
    }

    @Basic
    @Column(name = "LibelleSport")
    public String getLibelleSport() {
        return libelleSport;
    }

    public void setLibelleSport(String libelleSport) {
        this.libelleSport = libelleSport;
    }

    @Basic
    @Column(name = "UniteTpsSport")
    public String getUniteTpsSport() {
        return uniteTpsSport;
    }

    public void setUniteTpsSport(String uniteTpsSport) {
        this.uniteTpsSport = uniteTpsSport;
    }

    @Basic
    @Column(name = "TarifUnite")
    public int getTarifUnite() {
        return tarifUnite;
    }

    public void setTarifUnite(int tarifUnite) {
        this.tarifUnite = tarifUnite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sport sport = (Sport) o;

        if (codeSport != sport.codeSport) return false;
        if (tarifUnite != sport.tarifUnite) return false;
        if (libelleSport != null ? !libelleSport.equals(sport.libelleSport) : sport.libelleSport != null) return false;
        if (uniteTpsSport != null ? !uniteTpsSport.equals(sport.uniteTpsSport) : sport.uniteTpsSport != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeSport;
        result = 31 * result + (libelleSport != null ? libelleSport.hashCode() : 0);
        result = 31 * result + (uniteTpsSport != null ? uniteTpsSport.hashCode() : 0);
        result = 31 * result + tarifUnite;
        return result;
    }
}
