package main;

import java.util.UUID;

public class Chef extends Person{

	private String name, username, gender;
	private Integer age, salary = 3000;
	private boolean professionality = false;
	private UUID id;

	public Chef(UUID id, String name, String username, String gender, Integer age, boolean professionality) {
//		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.gender = gender;
		this.age = age;
		this.professionality = professionality;
	}
	
	@Override
	public UUID getId() {
		return id;
	}
	@Override
	public void setId(UUID id) {
		this.id = id;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String getGender() {
		return gender;
	}
	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public boolean isProfessionality() {
		return professionality;
	}
	public void setProfessionality(boolean professionality) {
		this.professionality = professionality;
	}
	
}
