package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.Foodcategory;


@RepositoryRestResource(path="category")
@CrossOrigin("http://localhost:4200")
public interface CategoryRepos extends JpaRepository<Foodcategory, Integer>{

}
