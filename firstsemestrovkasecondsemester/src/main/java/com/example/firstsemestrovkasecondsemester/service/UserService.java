package com.example.firstsemestrovkasecondsemester.service;

import com.example.firstsemestrovkasecondsemester.model.User;

public interface UserService {
        void save(User user);

        User findByUsername(String username);
    }

