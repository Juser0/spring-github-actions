package com.deploy.todo.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class UserResponseDto {

    @Getter
    @Builder
    public static class UserCreateResponseDto {
        private Long id;
        private String name;
        private String email;
        private int age;
    }

    @Getter
    public static class UserUpdateResponseDto {
        private Long id;
        private String name;
        private int age;
    }
}
