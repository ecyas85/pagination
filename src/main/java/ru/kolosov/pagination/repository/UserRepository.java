package ru.kolosov.pagination.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kolosov.pagination.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Page<User> findByNameContainingOrderById(String name, Pageable pageable);
}
