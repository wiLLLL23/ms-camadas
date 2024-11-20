package com.devwill.mscamadas.service;

import com.devwill.mscamadas.domain.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAllUsers();
    UserDto findById(Long id);
    UserDto findByName(String name);
}
