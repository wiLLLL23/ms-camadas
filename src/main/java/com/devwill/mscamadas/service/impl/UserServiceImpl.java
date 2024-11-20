package com.devwill.mscamadas.service.impl;

import com.devwill.mscamadas.domain.UserDto;
import com.devwill.mscamadas.repositories.UserRepository;
import com.devwill.mscamadas.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<UserDto> findAllUsers() {
        return repository.findAll()
                .stream()
                .map(user -> new UserDto(user))
                .toList();
    }

    @Override
    public UserDto findById(final Long id) {
        final var user = repository.findById(id).get();
        return new UserDto(user);
    }

    @Override
    public UserDto findByName(final String name) {
        final var user = repository.findByName(name);
        return new UserDto(user);
    }
}
