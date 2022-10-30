package com.soori.algorithmsite.user.service;

import com.soori.algorithmsite.user.DTO.UserDeleteDTO;
import com.soori.algorithmsite.user.DTO.UserSignUpDTO;
import com.soori.algorithmsite.user.User;
import com.soori.algorithmsite.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public User signUp(UserSignUpDTO userSignUpDTO) {
        User load_user = userSignUpDTO.toEntity();
        validateDuplicateUser(load_user);

        userRepository.save(load_user);
        return load_user;
    }

    @Override
    public User deleteUser(UserDeleteDTO userDeleteDTO) {
        User load_user = loadUserByUsername(userDeleteDTO.id());

        userRepository.delete(load_user);
        return load_user;
    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findById(username)
                .orElseThrow(() -> new UsernameNotFoundException((username)));
    }

    public void validateDuplicateUser(User user) {
        if (userRepository.findById(user.getUsername()).isPresent()) {
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }

    }

}
