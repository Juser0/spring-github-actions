package com.deploy.todo.user;

import com.deploy.todo.common.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private int age;

    public void updateName(String name) {
        this.name = name;
    }

    public void updateAge(int age) {
        this.age = age;
    }
}
