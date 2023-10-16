package com.dnapass.training.model;

import com.dnapass.training.entity.User;

public class PetModel {
	/**
	 * petId (Long), petName (String), petAge (Integer), petPlace (String), user (User)
	 * **/
	private Long petId;
	private String petName;
	private int petAge;
	private String petPlace;
	
	private User user;
	

	public Long getPetId() {
		return petId;
	}

	public void setPetId(Long petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getPetAge() {
		return petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}

	public String getPetPlace() {
		return petPlace;
	}

	public void setPetPlace(String petPlace) {
		this.petPlace = petPlace;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PetModel(Long petId, String petName, int petAge, String petPlace, User user) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.petAge = petAge;
		this.petPlace = petPlace;
		this.user = user;
	}

	public PetModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PetModel [petId=" + petId + ", petName=" + petName + ", petAge=" + petAge + ", petPlace=" + petPlace
				+ ", user=" + user + "]";
	}
	
	
	

}
