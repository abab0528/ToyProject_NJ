package com.nj.auth.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String userEmail){
        super(userEmail+"NotFoundException");
    }
}
