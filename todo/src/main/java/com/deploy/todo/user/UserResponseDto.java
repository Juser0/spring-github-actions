package com.deploy.todo.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class UserResponseDto {

    @Getter
    @Builder
    public static class UserCreateResponseDto {
        private Long id;

        private String name;

        private String email;

        private int age;

        private LocalDateTime createdAt;

        private LocalDateTime modifiedAt;
    }

    @Getter
    @Builder
    public static class UserUpdateResponseDto {
        private Long id;

        private String name;

        private int age;

        private LocalDateTime createdAt;

        private LocalDateTime modifiedAt;
    }
}
