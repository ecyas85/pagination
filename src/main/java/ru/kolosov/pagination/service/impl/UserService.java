package ru.kolosov.pagination.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.kolosov.pagination.domain.User;
import ru.kolosov.pagination.repository.UserRepository;
import ru.kolosov.pagination.service.IUserService;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService implements IUserService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public Page<User> getUsers(String name, int page, int size) {
        log.info("Fetching users for page: {} of size: {}", page, size);
        return userRepository.findByNameContainingOrderById(name, PageRequest.of(page, size));
    }
}
