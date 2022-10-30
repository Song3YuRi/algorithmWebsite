package com.soori.algorithmsite.Service;

import com.soori.algorithmsite.user.DTO.UserDeleteDTO;
import com.soori.algorithmsite.user.DTO.UserSignUpDTO;
import com.soori.algorithmsite.user.User;
import com.soori.algorithmsite.user.repository.UserRepository;
import com.soori.algorithmsite.user.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void 회원가입() {
        User user = userService.signUp(UserSignUpDTO.builder()
                .id("test1")
                .password("1234")
                .email("test@naver.com")
                .build());

        User find_user = userRepository.findById(user.getUsername())
                .orElseThrow(() -> new UsernameNotFoundException((user.getUsername())));

        Assertions.assertEquals(user.getUsername(), find_user.getUsername());
    }

    @Test
    public String UserSignUpDTOTest() {
        UserSignUpDTO userSignUpDTO = UserSignUpDTO.builder()
                .id("test00")
                .password("1234")
                .email("test@naver.com")
                .build();

        return userSignUpDTO.password();
    }

    @Test
    public void 회원삭제() {
        User delete_user = userService.deleteUser(UserDeleteDTO.builder()
                .id("test1")
                .password("1234")
                .email("test@naver.com")
                .build());

        Assertions.assertFalse(userRepository.findById("test1").isPresent());
    }

}
