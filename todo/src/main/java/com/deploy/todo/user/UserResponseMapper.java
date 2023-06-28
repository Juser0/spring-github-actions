package com.deploy.todo.user;

import com.deploy.todo.common.DtoMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserResponseMapper extends DtoMapper<UserResponseDto.UserCreateResponseDto, User> {
    UserResponseMapper MAPPER = Mappers.getMapper(UserResponseMapper.class);
}