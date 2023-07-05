package com.deploy.todo.user;

import com.deploy.todo.common.EntityMapper;
import static com.deploy.todo.user.UserRequestDto.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


public interface UserRequestMapper{
    @Mapper
    public interface CreateRequestMapper extends EntityMapper<UserCreateRequestDto, User> {
        CreateRequestMapper MAPPER = Mappers.getMapper(CreateRequestMapper.class);

        @Override
        @Mapping(target = "id", constant = "999L")
        User toEntity(final UserCreateRequestDto dto);
    }
}

