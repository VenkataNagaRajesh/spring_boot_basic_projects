package com.example.entity;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="users")
public class User {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int userid;
	
	@NotBlank(message="username shouldn't be null")
	@Column(name="username")
	private String userName;
	
	@Min(18)
	@Max(60)
	@Column(name="age")
	private int age;

	@Email(message="invalid email address")
	@Column(name="email")
	private String email;
	
	@Column(name="mobilenumber")
	private String mobileNumber;
	

	public User() {
		super();
		
	}

	
	
	
	
	public User(int userId, @NotNull(message="username shouldn't be null") String userName, 
			@Email(message="invalid email address") String email,
			String mobileNumber, 
			@Min(18) @Max(60) int age) {
		super();
		this.userid = userId;
		this.userName = userName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.age = age;
	}
	public int getUserId() {
		return userid;
	}
	public void setUserId(int userId) {
		this.userid = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	
}
