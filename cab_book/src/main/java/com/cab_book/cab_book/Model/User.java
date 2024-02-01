package com.cab_book.cab_book.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;


@Entity
@Table(name="Users")

public class User {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private String Name;
	
	
	private String Gender;
	
	
	private Integer Age;


	public User(Long id, String name, String gender, Integer age) {
		super();
		Id = id;
		Name = name;
		Gender = gender;
		Age = age;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public Integer getAge() {
		return Age;
	}


	public void setAge(Integer age) {
		Age = age;
	}


	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", Gender=" + Gender + ", Age=" + Age + "]";
	}
	
	

	
}