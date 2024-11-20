package com.devwill.mscamadas.repositories;

import com.devwill.mscamadas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
