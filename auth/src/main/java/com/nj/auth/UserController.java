package com.nj.auth;

import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping(value="/user")
public class UserController {

    private final UserService userService;

    @NotNull
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping(value="/login")
    public String login(){
        return "user/login";
    }

    @PostMapping(value="/join")
    public String singUp(){
        return "user/join";
    }


}
