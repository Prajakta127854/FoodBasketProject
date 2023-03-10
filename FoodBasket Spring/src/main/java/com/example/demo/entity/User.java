package com.example.demo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fb_user")
public class User {		
	
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)	
		@Column(name = "fbuserid")
	    private int fbuserid;

	    @Column(name = "firstName")
	    private String firstName;

	    @Column(name = "lastName")
	    private String lastName;
	    @Column(name = "username")
	    private String username;
	    @Column(name = "password")
	    private String password;
	    @Column(name = "address1")
	    private String address1;
	    @Column(name = "address2")
	    private String address2;
	    
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		public User(int fbuserid, String firstName, String lastName, String username, String password, String address1,
				String address2) {
			super();
			this.fbuserid=fbuserid;
			this.firstName = firstName;
			this.lastName = lastName;
			this.username = username;
this.password =password;
			this.address1 = address1;
			this.address2 = address2;
		}
		
		
		public int getFbuserid() {
			return fbuserid;
		}

		public void setFbuserid(int fbuserid) {
			this.fbuserid = fbuserid;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getAddress1() {
			return address1;
		}

		public void setAddress1(String address1) {
			this.address1 = address1;
		}

		public String getAddress2() {
			return address2;
		}

		public void setAddress2(String address2) {
			this.address2 = address2;
		}
		
		
		
}