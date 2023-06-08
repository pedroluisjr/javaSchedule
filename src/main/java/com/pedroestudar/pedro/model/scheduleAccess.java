package com.pedroestudar.pedro.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "users")
@Entity
public class scheduleAccess {

    @Id
    @Column(name = "personId", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "sobrenome", nullable = false)
    private String sobrenome;

    @Column(name = "numero",unique = true, nullable = false)
    private Long numero;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "idade", nullable = false)
    private Long idade;

    @Column(name = "sexo", nullable = false)
    private String sexo;

    @Column(name = "aniversario", nullable = false)
    private String aniversario;

    @Column(name = "createdAt")
    @CreationTimestamp
    private Date createdAt;
}
