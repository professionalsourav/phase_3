package com.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.repository.ProductRepository;
import com.restapi.repository.UserRepository;

@RestController
@RequestMapping("/project")
public class Controller {

	@Autowired
	UserRepository userRepository;
	@Autowired
	ProductRepository productRepository;
	
	
	
	
	
	
	
}
