package com.deploy.todo.user;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class UserRequestDto {

    @Getter
    @Builder
    public static class UserCreateRequestDto {

        @NotBlank
        private String name;

        @Email
        @NotBlank
        private String email;

        @Positive
        private int age;
    }

    @Getter
    public static class UserUpdateRequestDto {
        @NotBlank
        private String name;

        @Positive
        private int age;
    }
}
