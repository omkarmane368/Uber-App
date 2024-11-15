package com.springboot.project.uber.uberApp.services.impl;

import com.springboot.project.uber.uberApp.dto.DriverDTO;
import com.springboot.project.uber.uberApp.dto.SignUpDTO;
import com.springboot.project.uber.uberApp.dto.UserDTO;
import com.springboot.project.uber.uberApp.entities.User;
import com.springboot.project.uber.uberApp.entities.enums.Role;
import com.springboot.project.uber.uberApp.exceptions.RuntimeConflictException;
import com.springboot.project.uber.uberApp.repositories.UserRepository;
import com.springboot.project.uber.uberApp.services.AuthService;
import com.springboot.project.uber.uberApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RiderService riderService;

    @Override
    public String login(String email, String password) { return ""; }

    @Override
    public UserDTO signUp(SignUpDTO signUpDTO) {
        User user = userRepository.findByEmail(signUpDTO.getEmail()).orElse(null);

        if(user != null) {
            throw new RuntimeConflictException("Cannot SignUp, User already exists with email "+signUpDTO.getEmail());
        }

        User mappedUser = modelMapper.map(signUpDTO, User.class);
        mappedUser.setRoles(Set.of(Role.RIDER));

        User savedUser = userRepository.save(mappedUser);

        riderService.createNewRider(savedUser);

        return modelMapper.map(savedUser, UserDTO.class);
    }

    @Override
    public DriverDTO onboardNewDriver(Long userId) {
        return null;
    }
}
