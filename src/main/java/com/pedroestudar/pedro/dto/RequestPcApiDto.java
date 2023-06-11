package com.pedroestudar.pedro.dto;

import com.pedroestudar.pedro.model.scheduleAccess;
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

    public scheduleAccess getToScheduleAccess() {
        scheduleAccess saveCep = new scheduleAccess();
        saveCep.setRua(this.getLogradouro());
        saveCep.setBairro(this.getUf());
        saveCep.setCidade(this.getLocalidade());
        return saveCep;
    }
}