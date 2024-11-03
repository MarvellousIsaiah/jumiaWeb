package com.Jumia.JumiaWeb.data.repositories;

import com.Jumia.JumiaWeb.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface UserRepository extends MongoRepository<User,String> {
//   String userLogin();

   User findByUserName(String userName);

   boolean existsByEmail(String email);

   User findByEmail(String email);
}
