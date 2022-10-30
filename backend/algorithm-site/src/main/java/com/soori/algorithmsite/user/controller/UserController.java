package com.soori.algorithmsite.user.controller;

import com.soori.algorithmsite.user.User;
import com.soori.algorithmsite.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signUp")
    User signUp(User user) {
        return userService.signUp(user);
    }

}
