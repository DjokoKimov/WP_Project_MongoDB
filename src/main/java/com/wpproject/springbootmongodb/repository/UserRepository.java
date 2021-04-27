package com.wpproject.springbootmongodb.repository;

import com.wpproject.springbootmongodb.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
