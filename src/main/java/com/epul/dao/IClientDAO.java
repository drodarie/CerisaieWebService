package com.epul.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.epul.persistence.Client;

/**
 * Created by Dimitri on 08/10/2015.
 *
 * @version 1.0
 */
public interface IClientDAO extends JpaRepository<Client,Integer> {
    /*@Transactional
    @Modifying
    @Query("UPDATE Client set  ACT_NUMACTION = :act_numaction, LIBACTION = :lib, SCOREMIN = :scoremin where NUMACTION = :id")
    public void modifyAction(@Param("act_numaction") int act_numaction , @Param("lib") String lib, @Param("scoremin") int scoremin,@Param("id") int id);*/
}