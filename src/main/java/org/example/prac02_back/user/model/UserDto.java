package org.example.prac02_back.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class UserDto {
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Getter
    public static class SignupReq{
        private String email;
        private String name;
        private String password;

        public User toEntity(SignupReq dto) {
            return User.builder()
                    .email(dto.getEmail())
                    .name(dto.getName())
                    .password(dto.getPassword())
                    .build();
        }
    }
}
