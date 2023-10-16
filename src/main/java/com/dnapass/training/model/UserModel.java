package com.dnapass.training.model;

import com.dnapass.training.entity.Pet;

public class UserModel {

	/**
	 * userId (Long), userName (String), userPassword (String), confirmPassword (String), pets (Set)
	 * **/
	private Long userId;
	private String userName;
	private String userPassword;
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

	public UserModel(Long userId, String userName, String userPassword, String confirmPassword, Pet pets) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.confirmPassword = confirmPassword;
		this.pets = pets;
	}

	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserModel [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", confirmPassword=" + confirmPassword + ", pets=" + pets + "]";
	}
	
}
