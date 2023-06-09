package com.pedroestudar.pedro.controller;

import com.pedroestudar.pedro.dto.addUserDto;
import com.pedroestudar.pedro.service.addUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Validated
@RestController
@RequestMapping("/user")
public class AddUserController {
    @Autowired
    addUserService userService;

    @PostMapping("/addUser")
    public String addUser(@Valid @RequestBody addUserDto body) {
        return userService.save(body);
    }
    @GetMapping("/listAll")
    public Object getAllUsers() {
        return userService.listAll();
    }
}
