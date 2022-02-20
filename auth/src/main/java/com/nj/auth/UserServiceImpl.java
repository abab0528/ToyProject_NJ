package com.nj.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

    @RequiredArgsConstructor
    @Service
    public class UserServiceImpl implements UserService{

        private final UserRepository userRepository;

    @Override
    public UserVO login(UserVO userVO) {
        return userRepository.findByUserEmailAndUserPw(userVO.getUserEmail(), userVO.getUserPw());
    }

    @Override
    public UserVO createUser(UserVO userVO) {
        return userRepository.save(userVO);
    }

    @Override
    public UserVO findUserByUserEmail(String userEmail) {
        return userRepository.findByUserEmail(userEmail).get();
    }
}
