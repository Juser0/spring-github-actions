package com.deploy.todo.user;

import com.deploy.todo.common.DtoMapper;
import static com.deploy.todo.user.UserResponseDto.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

public interface UserResponseMapper {
    @Mapper
    public interface CreateResponseMapper extends DtoMapper<UserCreateResponseDto, User> {
        CreateResponseMapper MAPPER = Mappers.getMapper(CreateResponseMapper.class);
    }

    @Mapper
    public interface UpdateResponseMapper extends DtoMapper<UserUpdateResponseDto, User> {
        UpdateResponseMapper MAPPER = Mappers.getMapper(UpdateResponseMapper.class);
    }
}