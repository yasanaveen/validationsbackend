package com.frontendvalidations.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.frontendvalidations.entity.Login;
import com.frontendvalidations.repository.LoginfieldRepo;

@Service
public class createuserService {
	
	@Autowired
	private LoginfieldRepo loginfieldRepo;
	
	public Login createUser(Login login) {
		return loginfieldRepo.save(login);
	}

	public List<Login> fetchAll() {
		
		return loginfieldRepo.findAll();
	}

}
