package main;

import java.util.UUID;

public abstract class Person {
	String name, gender;
	UUID id;

	public abstract UUID getId();
	
	public abstract void setId(UUID id);

	public abstract String getName();

	public abstract void setName(String name);

	public abstract String getGender();

	public abstract void setGender(String gender);

}
