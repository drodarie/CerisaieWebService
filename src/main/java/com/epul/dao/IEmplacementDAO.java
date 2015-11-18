package com.epul.dao;

import com.epul.persistence.Emplacement;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dimitri on 18/11/2015.
 */
public interface IEmplacementDAO extends JpaRepository<Emplacement, Integer> {
}
