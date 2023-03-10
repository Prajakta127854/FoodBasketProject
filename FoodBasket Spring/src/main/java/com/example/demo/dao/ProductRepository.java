package com.example.demo.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Fbproduct;

@RepositoryRestResource(path="product")
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Fbproduct, Integer>{

 Page<Fbproduct>findByFbcategoryid(@RequestParam("fbcategoryid")Integer fbcategoryid,Pageable pageable);

	List<Fbproduct> findByfbproductname(String fbproductname);

	
}
