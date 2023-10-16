package com.dnapass.training.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Pets")
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="petId")
	private Long petId;
	
	@Column(name="petName")
	private String petName;
	
	@Column(name="petAge")
	private int petAge;
	
	@Column(name="petPlace")
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
	public Pet(Long petId, String petName, int petAge, String petPlace, User user) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.petAge = petAge;
		this.petPlace = petPlace;
		this.user = user;
	}
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", petName=" + petName + ", petAge=" + petAge + ", petPlace=" + petPlace
				+ ", user=" + user + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(petAge, petId, petName, petPlace, user);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return petAge == other.petAge && Objects.equals(petId, other.petId) && Objects.equals(petName, other.petName)
				&& Objects.equals(petPlace, other.petPlace) && Objects.equals(user, other.user);
	}

}
