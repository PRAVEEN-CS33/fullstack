package com.partypro.praveen.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.partypro.praveen.model.User;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
