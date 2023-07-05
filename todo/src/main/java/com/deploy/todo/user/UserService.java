package com.deploy.todo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import static com.deploy.todo.user.UserResponseDto.*;
import static com.deploy.todo.user.UserRequestDto.*;
import static com.deploy.todo.user.UserRequestMapper.*;
import static com.deploy.todo.user.UserResponseMapper.*;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserCreateResponseDto create(UserCreateRequestDto requestDto) {
        User user = CreateRequestMapper.MAPPER.toEntity(requestDto);
        userRepository.save(user);

        UserCreateResponseDto responseDto = CreateResponseMapper.MAPPER.toDto(user);
        return responseDto;
    }

    public UserCreateResponseDto read(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("잘못된 회원의 아이디입니다"));

        UserCreateResponseDto responseDto = CreateResponseMapper.MAPPER.toDto(user);
        return responseDto;
    }

    public List<UserCreateResponseDto> readAll() {
        List<UserCreateResponseDto> userList = new ArrayList<>();
        List<User> users = userRepository.findAll();
        for (User user : users) {
            UserResponseDto.UserCreateResponseDto dto = CreateResponseMapper.MAPPER.toDto(user);
            userList.add(dto);
        }
        return userList;
    }

    public UserUpdateResponseDto update(Long id, UserUpdateRequestDto dto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("잘못된 회원의 아이디입니다"));

        user.updateAge(dto.getAge());
        user.updateName(dto.getName());
        userRepository.save(user);

        UserUpdateResponseDto responseDto = UserUpdateResponseDto.builder()
                .age(dto.getAge())
                .name(dto.getName())
                .build();

        return responseDto;
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
