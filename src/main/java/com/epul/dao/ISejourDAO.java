package com.epul.dao;

import com.epul.persistence.Sejour;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Corinne on 25/10/2015.
 *
 * @version 1.0
 */
public interface ISejourDAO extends JpaRepository<Sejour, Integer> {
}