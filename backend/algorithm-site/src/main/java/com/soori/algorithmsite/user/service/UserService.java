package com.soori.algorithmsite.user.service;

import com.soori.algorithmsite.user.DTO.UserDeleteDTO;
import com.soori.algorithmsite.user.DTO.UserSignUpDTO;
import com.soori.algorithmsite.user.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    /*
    1. 회원가입
    2. 로그인
    3. 로그아웃
    4. 회원탈퇴
     */

    User signUp(UserSignUpDTO userSignUpDTO);
    User deleteUser(UserDeleteDTO userDeleteDTO);
}
