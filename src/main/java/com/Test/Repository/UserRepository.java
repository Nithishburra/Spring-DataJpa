package com.Test.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Test.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	

}
