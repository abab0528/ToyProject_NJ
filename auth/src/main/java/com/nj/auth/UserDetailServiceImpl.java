package com.nahyun.auth;

import com.nahyun.auth.exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Collections;

@RequiredArgsConstructor
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetailsVO loadUserByUsername(String userEmail){
        return userRepository.findByUserEmail(userEmail).map(u -> new UserDetailsVO(u, Collections.singleton(new SimpleGrantedAuthority(u.getUserRole().getValue())))).orElseThrow(()->new UserNotFoundException(userEmail));
    }
}
