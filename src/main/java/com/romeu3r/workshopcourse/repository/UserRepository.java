package com.romeu3r.workshopcourse.repository;

import com.romeu3r.workshopcourse.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
