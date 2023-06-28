package com.deploy.todo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void create() {

    }

    public void read() {

    }

    public List<UserResponseDto.UserCreateResponseDto> readAll() {
        List<UserResponseDto.UserCreateResponseDto> userList = new ArrayList<>();
        List<User> users = userRepository.findAll();
        for (User user : users) {
            UserResponseDto.UserCreateResponseDto dto = UserResponseMapper.MAPPER.toDto(user);
            userList.add(dto);
        }
        return userList;
    }

    public void update() {

    }

    public void delete() {

    }
}
