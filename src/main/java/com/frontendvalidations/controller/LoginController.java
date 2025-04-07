package com.frontendvalidations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.frontendvalidations.entity.Login;
import com.frontendvalidations.service.createuserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class LoginController {

	@Autowired
	private createuserService createuserService;

	@PostMapping("/login")
	public Login createUser(@RequestBody Login login) {
		return createuserService.createUser(login);

	}
	
	@GetMapping("/fetchAll")
	public List<Login> fetchAll() {
		return createuserService.fetchAll();
	}

}
