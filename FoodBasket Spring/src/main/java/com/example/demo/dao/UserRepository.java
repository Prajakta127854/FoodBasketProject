package com.example.demo.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;

@RepositoryRestResource(path="user")
@CrossOrigin("http://localhost:4200")
public interface UserRepository  extends JpaRepository<User, Integer>{


	List<User> findByfirstName(String firstName);

}
	