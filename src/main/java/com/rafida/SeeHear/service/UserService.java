package com.rafida.SeeHear.service;

import com.rafida.SeeHear.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User registerUser(User user);
}
