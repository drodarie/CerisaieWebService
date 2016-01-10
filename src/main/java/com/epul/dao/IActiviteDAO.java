package com.epul.dao;

import com.epul.persistence.Activite;
import com.epul.persistence.ActivitePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Dimitri on 07/11/2015.
 */
public interface IActiviteDAO extends JpaRepository<Activite, ActivitePK> {
    List<Activite> findByNumSej(int numSej);

    List<Activite> findByCodeSportAndDateJour(int codeSport, Timestamp dateJour);

   /* @Query("FROM activite WHERE NumSej= :numSej AND CodeSport= :codeSport AND DateJour= :dateJour")
    public Activite findByCodeSportNumSejAndDateJour(int numSej, int codeSport,  Timestamp dateJour);*/
}
