package com.jwt.latest.service.serviceimpl;



import com.jwt.latest.model.Team;
import com.jwt.latest.repository.TeamRepository;
import com.jwt.latest.service.IUserAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class userAccessService implements UserDetailsService, IUserAccessService {

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Team user = teamRepository.findByEmailIgnoreCaseAndIsDeleted(s, false);
        if (user == null) {
            user = teamRepository.findByMobileNumber(s);
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
                getAuthority(user));
    }

    private Collection<? extends GrantedAuthority> getAuthority(Team user) {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + "Admin"));
        return authorities;
    }
    @Override
    public Team findByEmail(String username) {
        Team user = teamRepository.findByEmailIgnoreCaseAndIsDeleted(username, false);
        if (user == null) {
            user = teamRepository.findByMobileNumber(username);
        }
        return user;
    }
}



