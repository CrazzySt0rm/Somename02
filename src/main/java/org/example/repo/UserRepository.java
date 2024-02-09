package org.example.repo;

import org.example.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

//    List<User> findByAgeContaining(int age);
    List<User> findByAgeContaining(String age);



    List<User> findByUsernameContaining(String username);
}
