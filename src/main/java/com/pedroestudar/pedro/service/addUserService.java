package com.pedroestudar.pedro.service;

import com.pedroestudar.pedro.dto.addUserDto;
import com.pedroestudar.pedro.model.scheduleAccess;
import com.pedroestudar.pedro.repository.scheduleAccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class addUserService {
    @Autowired
    scheduleAccessRepository access;

    public String save(addUserDto body) {
        Optional<scheduleAccess> sAccess = access.findByEmail(body.getEmail());
        if (sAccess.isEmpty()) {
            access.save(body.toscheduleAccess());
            return "Usuário cadastrado";
        } else {
            return "Email já existe";
        }
    }

    public Object listAll() {
        return access.findAll();
    }
}
