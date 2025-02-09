package com.course.workshopmongo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.workshopmongo.domain.Post;
import com.course.workshopmongo.repository.PostRepository;
import com.course.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired 
	private PostRepository repo; // # não recisa instanciar o objeto quando se usa o @Autowired
	
	

	
	public Post findById(String id) {
		Post user = repo.findById(id).orElse(null); // retorna nulo se não encontrar o id
		if (user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		
		return user;
	}
	public List<Post>findByTitle(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}
		
	
}