package com.dnapass.training.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private Long userId;
	
	@Column(name="User name")
	private String userName;
	
	@Column(name="userPassword")
	private String userPassword;
	
	@Column(name="confirmPassword")
	private String confirmPassword;
	
	private Pet pets;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Pet getPets() {
		return pets;
	}

	public void setPets(Pet pets) {
		this.pets = pets;
	}

	public User(Long userId, String userName, String userPassword, String confirmPassword, Pet pets) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.confirmPassword = confirmPassword;
		this.pets = pets;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", confirmPassword=" + confirmPassword + ", pets=" + pets + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(confirmPassword, pets, userId, userName, userPassword);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(confirmPassword, other.confirmPassword) && Objects.equals(pets, other.pets)
				&& Objects.equals(userId, other.userId) && Objects.equals(userName, other.userName)
				&& Objects.equals(userPassword, other.userPassword);
	}
	
	
}
