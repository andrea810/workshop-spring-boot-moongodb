package com.course.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.workshopmongo.domain.User;
import com.course.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired 
	private UserRepository repo; // # não recisa instanciar o objeto quando se usa o @Autowired
	
	public List<User> findAll(){
		return repo.findAll();	
	}
}
