package com.course.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.course.workshopmongo.domain.Post;



@Repository
public interface PostRepository extends MongoRepository <Post , String>{
	
	//IgnoreCase retorna a busca ignorando se a primeira letra é maiuscula ou minuscula
	List<Post> findByTitleContainingIgnoreCase(String text);
	

}
