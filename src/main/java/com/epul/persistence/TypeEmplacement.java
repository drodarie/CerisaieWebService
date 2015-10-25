package com.epul.persistence;

import javax.persistence.*;

/**
 * Created by Toromis on 24/10/2015.
 */
@Entity
@Table(name = "type_emplacement", schema = "", catalog = "cerisaie")
public class TypeEmplacement {
    private int codeTypeE;
    private String libtypepl;
    private float tariftypepl;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "CodeTypeE")
    public int getCodeTypeE() {
        return codeTypeE;
    }

    public void setCodeTypeE(int codeTypeE) {
        this.codeTypeE = codeTypeE;
    }

    @Basic
    @Column(name = "LIBTYPEPL")
    public String getLibtypepl() {
        return libtypepl;
    }

    public void setLibtypepl(String libtypepl) {
        this.libtypepl = libtypepl;
    }

    @Basic
    @Column(name = "TARIFTYPEPL")
    public float getTariftypepl() {
        return tariftypepl;
    }

    public void setTariftypepl(float tariftypepl) {
        this.tariftypepl = tariftypepl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeEmplacement that = (TypeEmplacement) o;

        if (codeTypeE != that.codeTypeE) return false;
        if (Float.compare(that.tariftypepl, tariftypepl) != 0) return false;
        if (libtypepl != null ? !libtypepl.equals(that.libtypepl) : that.libtypepl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeTypeE;
        result = 31 * result + (libtypepl != null ? libtypepl.hashCode() : 0);
        result = 31 * result + (tariftypepl != +0.0f ? Float.floatToIntBits(tariftypepl) : 0);
        return result;
    }
}
