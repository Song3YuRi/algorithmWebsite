package com.soori.algorithmsite.user.DTO;

import com.soori.algorithmsite.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Builder
public record UserSignUpDTO(
        @NotBlank(message = "아이디는 필수 입력값입니다.") @Size(message = "5~12자리 길이를 맞춰주세요.", min = 5, max = 12)
        String id,

        @NotBlank(message = "비밀번호는 필수 입력값입니다.") @Size(message = "5~12자리 길이를 맞춰주세요.", min = 5, max = 12)
        String password,

        @Email(message = "이메일 입력하세요")
        String email

        ) {

        public User toEntity() {
                return User.builder()
                        .id(this.id)
                        .password(this.password)
                        .email(this.email)
                        .build();
        }
}
