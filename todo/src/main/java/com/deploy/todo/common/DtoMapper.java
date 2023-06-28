package com.deploy.todo.common;

public interface DtoMapper<D, E> {
    D toDto(final E entity);
}
