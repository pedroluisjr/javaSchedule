package com.pedroestudar.pedro.dto;

import com.pedroestudar.pedro.model.scheduleAccess;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Valid
@Data
public class addUserDto {

    @NotNull(message = "O campo username não pode ser vazio")
    private String username;

    @NotNull(message = "O campo surname não pode ser vazio")
    private String surname;

    @NotNull(message = "O campo email não pode ser vazio") @Email(message = "Email inválido")
    private String email;

    private String anniversary;

    private String sex;

    @NotNull(message = "O campo número não pode ser vazio")
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

