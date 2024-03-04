package com.needin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.needin.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByFirstName(String firstName);
	//User findByMobile(String mobile);
}
