package com.pmalipio.myrest.security.repositories;

import com.pmalipio.myrest.security.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findOneByUsername(String username);
}
