package com.vibe.the.release.classes;

import java.util.ArrayList;

import com.vibe.the.release.enums.GrowthStage;

public abstract class Animal
{	
	
	//Attributes for Animal
	
	public String name = "Animal";
	public String gender = "No Gender assigned";
	public int age = 0;
	public GrowthStage growthStage;
	
	//Arrays
	
	ArrayList<Animal> Zoo = new ArrayList<Animal>();
	
	//Constructors
	
	public Animal(String name, String gender, int age, GrowthStage growthStage)//Generic constructor
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.growthStage = growthStage;
	}
	
	public Animal()//No args constructor
	{
		
	}
	
	//Methods for Animal that all classes would need.
	
	public abstract void eat();
	public abstract void grow();
	public abstract void reproduce();
	public abstract void sleep();
	public abstract void die();
	public abstract void move();

	public void addAnimal()
	{
		
	}
	public void removeAnimal()
	{
		
	}
	
	//Getters and setters
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getGender() {
		return gender;
	}
	

	public void setGender(String gender) {
		this.gender = gender;
	}
	

	public int getAge() {
		return age;
	}
	

	public void setAge(int age) {
		this.age = age;
	}	
}
