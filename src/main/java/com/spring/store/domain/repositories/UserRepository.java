package com.spring.store.domain.repositories;

import com.spring.store.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
