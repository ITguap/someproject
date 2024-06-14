package com.example.demoex2.service;

import com.example.demoex2.model.Role;
import com.example.demoex2.model.User;
import com.example.demoex2.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

 public void save(User user){
    user.getRoles().add(Role.ROLE_USER);
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    userRepository.save(user);
 }
}
