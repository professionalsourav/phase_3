package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.Product;
import com.restapi.model.User;
import com.restapi.repository.ProductRepository;
import com.restapi.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	
	
	@PostMapping("adduser")
	public User addUser(@RequestBody User user)
	{
		User addUser = this.userRepository.save(user);
		return addUser;
	}
	
	@GetMapping("/allusers")
	public List<User> getAllProducts()
	{
		List<User> list =(List<User>)this.userRepository.findAll();
		
		return list;
	}
	
	@DeleteMapping("/delete/{userid}")
	public void deleteBYId(@PathVariable("userid") int userid)
	{
		this.userRepository.deleteById(userid);
	}
	
	
	
	
}
