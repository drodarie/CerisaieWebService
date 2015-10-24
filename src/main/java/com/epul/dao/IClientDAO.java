package com.epul.dao;

import com.epul.persistence.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dimitri on 08/10/2015.
 *
 * @version 1.0
 */
public interface IClientDAO extends JpaRepository<Client,Integer> {
}