package com.example.maternitycare.repository;

import com.example.maternitycare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
