package hu.citec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.citec.dao.RegistrationRepository;
import hu.citec.entity.User;


@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository repo;

	
//	public void registration(User user) {
//		repo.registration(user);
//	}
	
	public boolean findUser(String username, String password) {
		return repo.findUser(username, password);
	}

}
