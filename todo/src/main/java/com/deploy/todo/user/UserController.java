package com.deploy.todo.user;

import com.deploy.todo.common.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<CommonResponse<?>> findUserAll() {
        List<UserResponseDto.UserCreateResponseDto> dto = userService.readAll();
        return ResponseEntity.status(200)
                .body(CommonResponse.builder()
                        .responseCode("USER_FOUND")
                        .responseMessage("회원 전체 조회 완료")
                        .data(dto)
                        .build());
    }

    @GetMapping("/{id}")
    public void findUserOne() {

    }

    @PostMapping
    public void createUser() {

    }

    @PutMapping("/{id}")
    public void updateUser() {

    }

    @DeleteMapping("/{id}")
    public void deleteUser() {

    }
}
