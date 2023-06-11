package com.pedroestudar.pedro.repository;

import com.pedroestudar.pedro.model.scheduleAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Repository
public interface scheduleAccessRepository extends JpaRepository<scheduleAccess, Long> {

    @Query(value = "select sAccess from scheduleAccess sAccess where sAccess.email = :email OR sAccess.numero = :number")
    List<scheduleAccess> findUser(String email, @NotNull(message = "O campo número não pode ser vazio") @Pattern(regexp = "\\d{10}", message = "O número de telefone deve ter 10 dígitos.") Long number);

    // @Query(value = "select sAccess from scheduleAccess sAccess where sAccess.numero = :numero")
    //Optional<scheduleAccess> findByNumber(Long numero);
}

