package com.fpt.timtro.timtro_server.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "_user")
@Entity
public class UserModel {
	@Column(name = "id_user")
	@Id @GeneratedValue Integer id;
	
	@Column(name = "full_name")
	String fullname;
	
	@Column(name = "student_code")
	String studentCode;
	
	@Column(name = "identification")
	String identification;
	
	@Column(name = "account")
	String account;
	
	@Column(name = "_password")
	String password;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return fullname;
	}


	public void setName(String name) {
		this.fullname = name;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getStudentCode() {
		return studentCode;
	}


	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}


	public String getIdentification() {
		return identification;
	}


	public void setIdentification(String identification) {
		this.identification = identification;
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
