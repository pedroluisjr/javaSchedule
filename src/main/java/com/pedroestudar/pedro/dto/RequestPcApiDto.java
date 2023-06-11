package com.pedroestudar.pedro.dto;

import lombok.Data;

@Data
public class RequestPcApiDto {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String ddd;
}