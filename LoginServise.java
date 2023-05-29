package com.online.voting.OVM.Servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.voting.OVM.Model.UserLogin;
import com.online.voting.OVM.Repository.LoginRepository;

@Service
public class LoginServise {
	@Autowired
	LoginRepository loginRepository;

	public void loginData(UserLogin login) {
		loginRepository.save(login);
	}

}
