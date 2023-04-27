package com.restapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.restapi.model.Product;
import com.restapi.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	
	
}
