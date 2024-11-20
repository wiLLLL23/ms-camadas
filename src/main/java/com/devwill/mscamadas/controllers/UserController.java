package com.devwill.mscamadas.controllers;

import com.devwill.mscamadas.domain.UserDto;
import com.devwill.mscamadas.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<UserDto> findAllUsers() {
        return ResponseEntity.ok(new UserDto());
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable final Long id) {
        final var user = service.findById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping(value = "/name/{name}")
    public ResponseEntity<UserDto> findByName(@PathVariable final String name) {
        final var user = service.findByName(name);
        return ResponseEntity.ok(user);
    }
}
