package com.online.voting.OVM.Servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.voting.OVM.Model.User;
import com.online.voting.OVM.Repository.UserRepository;

@Service
public class UserServise {
	@Autowired
	UserRepository userRepository;

	public void saveData(User user) {
		userRepository.save(user);
	}
}
