package com.soori.algorithmsite.user.controller;

import com.soori.algorithmsite.user.DTO.UserDeleteDTO;
import com.soori.algorithmsite.user.DTO.UserSignUpDTO;
import com.soori.algorithmsite.user.User;
import com.soori.algorithmsite.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signUp")
    User signUp(UserSignUpDTO userSignUpDTO) {
        return userService.signUp(userSignUpDTO);
    }

}
