package com.devwill.mscamadas.domain;

import com.devwill.mscamadas.entities.User;

public class UserDto {

    private Long id;
    private String name;

    public UserDto() {
    }

    public UserDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserDto(User user) {
        id = user.getId();
        name = user.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
