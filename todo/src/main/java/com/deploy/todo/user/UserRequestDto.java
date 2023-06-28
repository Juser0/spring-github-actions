package com.deploy.todo.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

public class UserRequestDto {

    @Getter
    @Builder
    public static class UserCreateRequestDto {

        @NotEmpty
        private String name;

        @Email
        @NotEmpty
        private String email;

        @Positive
        private int age;
    }

    @Getter
    public static class UserUpdateRequestDto {
        @NotEmpty
        private String name;

        @Positive
        private int age;
    }
}
