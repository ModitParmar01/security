package com.mdt.security.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository<User, Integer> {
    
    Optional<User> findByEmail(String email);

}
