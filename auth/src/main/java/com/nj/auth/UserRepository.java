package com.nahyun.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserVO, Long> {

    UserVO findByUserEmailAndUserPw(String userId, String userPw);

    Optional<UserVO> findByUserEmail(String UserEmail);
}
