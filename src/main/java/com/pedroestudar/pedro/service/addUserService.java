package com.pedroestudar.pedro.service;

import com.pedroestudar.pedro.dto.RequestPcApiDto;
import com.pedroestudar.pedro.dto.addUserDto;
import com.pedroestudar.pedro.model.scheduleAccess;
import com.pedroestudar.pedro.repository.scheduleAccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class addUserService {

    @Autowired
    RequestPcApiService searchCep;
    @Autowired
    scheduleAccessRepository access;
    public String save(addUserDto body) {
        RequestPcApiDto sCep = searchCep.searchDto(body.getCep());
        System.out.println("Rua "+sCep.getLogradouro());
        System.out.println("Bairro "+sCep.getBairro());
        System.out.println("Cidade "+sCep.getLocalidade());
        List<scheduleAccess> sAccess = access.findUser(body.getEmail(), body.getNumber());
        if (sAccess.isEmpty()) {
            access.save(body.toscheduleAccess(sCep));
            return "Usuário cadastrado";
        } else {
            return "Email ou número já existe";
        }
    }

    public Object listAll() {
        return access.findAll();
    }
}
