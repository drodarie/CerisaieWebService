package com.epul.dao;

import com.epul.persistence.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dimitri on 07/11/2015.
 */
public interface ISportDAO extends JpaRepository<Sport, Integer> {
}
