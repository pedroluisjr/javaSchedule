package com.pedroestudar.pedro.repository;

import com.pedroestudar.pedro.model.scheduleAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface scheduleAccessRepository extends JpaRepository<scheduleAccess, Long> {

    @Query(value = "select sAccess from scheduleAccess sAccess where sAccess.email = :email")
    Optional<scheduleAccess> findByEmail(String email);

    // @Query(value = "select sAccess from scheduleAccess sAccess where sAccess.numero = :numero")
    //Optional<scheduleAccess> findByNumber(Long numero);
}

