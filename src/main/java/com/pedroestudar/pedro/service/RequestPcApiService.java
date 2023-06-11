package com.pedroestudar.pedro.service;

import com.pedroestudar.pedro.dto.RequestPcApiDto;
import com.pedroestudar.pedro.model.scheduleAccess;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RequestPcApiService {
    public RequestPcApiDto searchDto (String cep) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<RequestPcApiDto> rest = restTemplate.getForEntity(("http://viacep.com.br/ws/"+cep+"/json/"), RequestPcApiDto.class);
        return rest.getBody();
    }
}
