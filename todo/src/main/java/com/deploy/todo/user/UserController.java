package com.deploy.todo.user;

import com.deploy.todo.common.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.deploy.todo.user.UserResponseDto.*;
import static com.deploy.todo.user.UserRequestDto.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<CommonResponse<?>> findUserAll() {
        List<UserCreateResponseDto> responseDto = userService.readAll();

        return ResponseEntity.status(200)
                .body(CommonResponse.builder()
                        .responseCode("USERS_FOUND")
                        .responseMessage("회원 전체 조회 완료")
                        .data(responseDto)
                        .build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommonResponse<?>> findUserOne(@PathVariable Long id) {
        UserCreateResponseDto responseDto = userService.read(id);

        return ResponseEntity.status(200)
                .body(CommonResponse.builder()
                        .responseCode("USER_FOUND")
                        .responseMessage("회원 식별자로 조회 완료")
                        .data(responseDto)
                        .build());
    }

    @PostMapping
    public ResponseEntity<CommonResponse<?>> createUser(@Valid @RequestBody final UserCreateRequestDto requestDto) {
        UserCreateResponseDto responseDto = userService.create(requestDto);

        return ResponseEntity.status(201)
                .body(CommonResponse.builder()
                        .responseCode("USER_CREATED")
                        .responseMessage("회원 생성 완료")
                        .data(responseDto)
                        .build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<CommonResponse<?>> updateUser(@Valid @RequestBody final UserUpdateRequestDto requestDto, @PathVariable Long id) {
        UserUpdateResponseDto responseDto = userService.update(id, requestDto);

        return ResponseEntity.status(200)
                .body(CommonResponse.builder()
                        .responseCode("USER_EDITED")
                        .responseMessage("회원 수정 완료")
                        .data(responseDto)
                        .build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CommonResponse<?>> deleteUser(@PathVariable Long id) {
        userService.delete(id);

        return ResponseEntity.status(204)
                .body(CommonResponse.builder()
                        .responseCode("USER_DELETED")
                        .responseMessage("회원 삭제 완료")
                        .build());
    }
}
