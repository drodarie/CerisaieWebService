package com.epul.persistence;

import javax.persistence.*;

/**
 * Created by Toromis on 24/10/2015.
 */
@Entity
public class Emplacement {
    private int numEmpl;
    private int codeTypeE;
    private float surfaceEmpl;
    private int nbPersMaxEmpl;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "NumEmpl")
    public int getNumEmpl() {
        return numEmpl;
    }

    public void setNumEmpl(int numEmpl) {
        this.numEmpl = numEmpl;
    }

    @Column(name = "CodeTypeE")
    public int getCodeTypeE() {
        return codeTypeE;
    }

    public void setCodeTypeE(int codeTypeE) {
        this.codeTypeE = codeTypeE;
    }

    @Basic
    @Column(name = "SurfaceEmpl")
    public float getSurfaceEmpl() {
        return surfaceEmpl;
    }

    public void setSurfaceEmpl(float surfaceEmpl) {
        this.surfaceEmpl = surfaceEmpl;
    }

    @Basic
    @Column(name = "NbPersMaxEmpl")
    public int getNbPersMaxEmpl() {
        return nbPersMaxEmpl;
    }

    public void setNbPersMaxEmpl(int nbPersMaxEmpl) {
        this.nbPersMaxEmpl = nbPersMaxEmpl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emplacement that = (Emplacement) o;

        return numEmpl == that.numEmpl && codeTypeE == that.codeTypeE &&
                Float.compare(that.surfaceEmpl, surfaceEmpl) == 0 &&
                nbPersMaxEmpl == that.nbPersMaxEmpl;

    }

    @Override
    public int hashCode() {
        int result = numEmpl;
        result = 31 * result + codeTypeE;
        result = 31 * result + (surfaceEmpl != +0.0f ? Float.floatToIntBits(surfaceEmpl) : 0);
        result = 31 * result + nbPersMaxEmpl;
        return result;
    }
}
