package com.cab_book.cab_book.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;


@Entity
@Table(name="Drivers")
public class Driver {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String Name;
	private String Gender;
	private Integer Age;
	private String Vehicle;
	private String Reg_No;
	private List<String> Location = new ArrayList<String>();
	public Driver(Long id, String name, String gender, Integer age, String vehicle, String reg_No,
			List<String> location) {
		super();
		Id = id;
		Name = name;
		Gender = gender;
		Age = age;
		Vehicle = vehicle;
		Reg_No = reg_No;
		Location = location;
	}
	public Driver() {
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
	public String getVehicle() {
		return Vehicle;
	}
	public void setVehicle(String vehicle) {
		Vehicle = vehicle;
	}
	public String getReg_No() {
		return Reg_No;
	}
	public void setReg_No(String reg_No) {
		Reg_No = reg_No;
	}
	public List<String> getLocation() {
		return Location;
	}
	public void setLocation(List<String> location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Driver [Id=" + Id + ", Name=" + Name + ", Gender=" + Gender + ", Age=" + Age + ", Vehicle=" + Vehicle
				+ ", Reg_No=" + Reg_No + ", Location=" + Location + "]";
	}
	
	

}
