package ru.kolosov.pagination.service;

import org.springframework.data.domain.Page;
import ru.kolosov.pagination.domain.User;

public interface IUserService {
    Page<User> getUsers(String name, int page, int size);
}
