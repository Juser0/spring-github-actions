package com.deploy.todo.user;

import com.deploy.todo.common.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserRequestMapper extends EntityMapper<UserRequestDto.UserCreateRequestDto, User> {
    UserRequestMapper MAPPER = Mappers.getMapper(UserRequestMapper.class);

    @Override
    @Mapping(target = "id", constant = "999L")
    User toEntity(final UserRequestDto.UserCreateRequestDto dto);
}
