package com.bookDairy.repository;

import com.bookDairy.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Maryna Kontar.
 */
@Repository
public interface UserRepository extends MongoRepository<User,String>{
    User findByUsername(String username);

    User findByEmail(String email);
}
