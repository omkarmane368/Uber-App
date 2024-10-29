package com.springboot.project.uber.uberApp.services;

import com.springboot.project.uber.uberApp.dto.DriverDTO;
import com.springboot.project.uber.uberApp.dto.SignUpDTO;
import com.springboot.project.uber.uberApp.dto.UserDTO;

public interface AuthService {
    String login(String email, String password);

    UserDTO signUp(SignUpDTO signUpDTO);

    DriverDTO onboardNewDriver(Long userId);
}
