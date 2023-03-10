package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="fb_product")
public class Fbproduct {

	@Column(name="fbproductid")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int  fbproductid;
	@Column(name=" fbproductname")
	private String  fbproductname;
	@Column(name="fbproduct_description")
	private String fbproduct_description;
	@Column(name="unit_price")
	private Double unit_price;
	@Column(name=" fbproduct_image")
	private String  fbproduct_image;
	@Column(name="active")
      private Integer active;
	@Column(name="available_stock")
	private Integer available_stock;
	@Column(name="date_created")
	private Date   date_updated;
	@Column(name=" last_updated")
	private Date    last_updated;
	@Column(name="fbcategoryid")
	private Integer fbcategoryid;
	@ManyToOne(targetEntity=Foodcategory.class,fetch=FetchType.EAGER)
	@JoinColumn(name="fbcategoryid",insertable=false,updatable=false)
	private Foodcategory foc;
	public Fbproduct() {
		super();
		// TODO Auto-generated constructor stub
	}
public Fbproduct(int fbproductid, String fbproductname, String fbproduct_description, Double unit_price,
		String fbproduct_image,Integer  active, Integer available_stock, Date date_updated, Date last_updated,
		Integer fbcategoryid) {
	super();
	this.fbproductid = fbproductid;
	this.fbproductname = fbproductname;
	this.fbproduct_description = fbproduct_description;
	this.unit_price = unit_price;
	this.fbproduct_image = fbproduct_image;
	this.active = active;
	this.available_stock = available_stock;
	this.date_updated = date_updated;
	this.last_updated = last_updated;
	this.fbcategoryid = fbcategoryid;
}
public int getFbproductid() {
	return fbproductid;
}
public void setFbproductid(int fbproductid) {
	this.fbproductid = fbproductid;
}
public String getFbproductname() {
	return fbproductname;
}
public void setFbproductname(String fbproductname) {
	this.fbproductname = fbproductname;
}
public String getFbproduct_description() {
	return fbproduct_description;
}
public void setFbproduct_description(String fbproduct_description) {
	this.fbproduct_description = fbproduct_description;
}
public Double getUnit_price() {
	return unit_price;
}
public void setUnit_price(Double unit_price) {
	this.unit_price = unit_price;
}
public String getFbproduct_image() {
	return fbproduct_image;
}
public void setFbproduct_image(String fbproduct_image) {
	this.fbproduct_image = fbproduct_image;
}

public Integer getActive() {
	return active;
}
public void setActive(Integer active) {
	this.active = active;
}
public Integer getAvailable_stock() {
	return available_stock;
}
public void setAvailable_stock(Integer available_stock) {
	this.available_stock = available_stock;
}
public Date getDate_updated() {
	return date_updated;
}
public void setDate_updated(Date date_updated) {
	this.date_updated = date_updated;
}
public Date getLast_updated() {
	return last_updated;
}
public void setLast_updated(Date last_updated) {
	this.last_updated = last_updated;
}
public Integer getFbcategoryid() {
	return fbcategoryid;
}
public void setFbcategoryid(Integer fbcategory_d) {
	this.fbcategoryid = fbcategoryid;
}
	
	
	
	
}
