package com.example.firstsemestrovkasecondsemester.repo;

import com.example.firstsemestrovkasecondsemester.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
