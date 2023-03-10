package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="food_category")
public class Foodcategory {

	
	@Id
	@Column(name="fbcategoryid")
	private int fbcategoryid;
	@Column(name="fbcategoryname")
	private String fbcategoryname;
	@OneToMany(mappedBy="foc")
	private Set<Fbproduct>products;

	
	public Foodcategory() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Foodcategory(int fbcategoryid, String fbcategoryname) {
		super();
		this.fbcategoryid = fbcategoryid;
		this.fbcategoryname = fbcategoryname;
	}


	public int getFbcategoryid() {
		return fbcategoryid;
	}


	public void setFbcategoryid(int fbcategoryid) {
		this.fbcategoryid = fbcategoryid;
	}


	public String getFbcategoryname() {
		return fbcategoryname;
	}


	public void setFbcategoryname(String fbcategoryname) {
		this.fbcategoryname = fbcategoryname;
	}
	
//	@OneToMany(mappedBy="dept")
//	private Set<Employee>employees;

	
}
