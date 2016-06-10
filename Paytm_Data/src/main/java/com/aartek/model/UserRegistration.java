package com.aartek.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class UserRegistration implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;

	@Column(name="First_Name")
	private String first_name;
	
	@Column(name="Last_Name")
	private String last_name;
	
	@Column(name="Mobile_No")
	private String mobile_no;
	
	@Column(name="Email_Id")
	private String email_id;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Address")
	private String address;
	/*@OneToOne
	@JoinColumn(name="emailId")
	private UserLogin login;
     @OneToOne
	 @JoinColumn(name="password")
private UserLogin login1;
	public UserLogin getLogin() {
		return login;
	}

	public void setLogin(UserLogin login) {
		this.login = login;
	}

	public UserLogin getLogin1() {
		return login1;
	}

	public void setLogin1(UserLogin login1) {
		this.login1 = login1;
	}
*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}