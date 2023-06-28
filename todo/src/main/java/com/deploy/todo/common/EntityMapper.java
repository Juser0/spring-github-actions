package com.deploy.todo.common;

public interface EntityMapper<D, E> {
    E toEntity(final D dto);
}
