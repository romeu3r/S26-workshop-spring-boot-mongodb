package com.romeu3r.workshopcourse.repository;

import com.romeu3r.workshopcourse.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
