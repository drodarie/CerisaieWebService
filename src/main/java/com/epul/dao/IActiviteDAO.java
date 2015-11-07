package com.epul.dao;

import com.epul.persistence.Activite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Dimitri on 07/11/2015.
 */
public interface IActiviteDAO extends JpaRepository<Activite, Integer> {
    List<Activite> findByNumSej(int numSej);
}
