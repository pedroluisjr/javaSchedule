package com.pedroestudar.pedro.dto;

import com.pedroestudar.pedro.model.scheduleAccess;
import lombok.Data;

@Data
public class addUserDto {
    private String username;

    private String surname;

    private String email;

    private String anniversary;

    private String sex;

    private Long number;

    private Long age;

    public scheduleAccess toscheduleAccess() {
        scheduleAccess sAccess = new scheduleAccess();
        sAccess.setAniversario(this.getAnniversary());
        sAccess.setNome(this.getUsername());
        sAccess.setSobrenome(this.getSurname());
        sAccess.setNumero(this.getNumber());
        sAccess.setIdade(this.getAge());
        sAccess.setEmail(this.getEmail());
        sAccess.setSexo(this.getSex());

        return sAccess;
    }
}

