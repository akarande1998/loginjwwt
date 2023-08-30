package com.jwt.latest.service;

import com.jwt.latest.model.Team;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUserAccessService {
    UserDetails loadUserByUsername(String email);

    Team findByEmail(String username);
}
