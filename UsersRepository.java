package com.seneca.projecttracker.repository;

import com.seneca.projecttracker.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends CrudRepository<UserEntity,Integer> {
    UserEntity findByEmailAndPassword(String email, String password);
    Optional<UserEntity> findByEmail(String email);
}
