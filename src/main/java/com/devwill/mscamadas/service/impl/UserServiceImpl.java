package com.devwill.mscamadas.service.impl;

import com.devwill.mscamadas.domain.UserDto;
import com.devwill.mscamadas.repositories.UserRepository;
import com.devwill.mscamadas.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

//    @Override
//    public UserDto findAllUsers() {
//        final var users = repository.findAll();
//        return new UserDto(users);
//    }

    @Override
    public UserDto findById(final Long id) {
        final var user = repository.findById(id).get();
        return new UserDto(user);
    }


}
