package main;

import java.util.UUID;

public class Customer extends Person{
	String name, gender;
	UUID id;
	Integer age;
	UUID food;
	Integer foodPrice;
	
	public Customer(String name, String gender, UUID id, Integer age, UUID food, Integer foodPrice) {
		super();
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.age = age;
		this.food = food;
		this.foodPrice = foodPrice;
	}

	public UUID getFood() {
		return food;
	}

	public void setFood(UUID food) {
		this.food = food;
	}

	public Integer getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(Integer foodPrice) {
		this.foodPrice = foodPrice;
	}

	public Customer(String name, String gender, UUID id, Integer age) {
		super();
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.age = age;
	}

	@Override
	public UUID getId() {
		return id;
	}
	@Override
	public void setId(UUID id) {
		this.id = id;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getGender() {
		return gender;
	}
	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}

}
