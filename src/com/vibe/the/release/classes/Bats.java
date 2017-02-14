package com.vibe.the.release.classes;

import com.vibe.the.release.enums.GrowthStage;
import com.vibe.the.release.interfaces.Flying;

public abstract class Bats extends Mammals implements Flying
{
	//Variables
	public String type = "Bat";
	
	//Constructors
	public Bats(String name, String gender, int age, GrowthStage growthStage,String type)
	{
		super(name, gender, age, growthStage);
		this.type = type;
	}
	public Bats()//no args constructors
	{
		
	}
	
	//Methods
	public void fly() //implemented from flying interface. 
	{
		System.out.println("Bats can fly");
	}
		

	//Getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public abstract void eat();
	public abstract void grow();
	public abstract void reproduce();
	public abstract void sleep();
	public abstract void die();
	public abstract void move();
	public abstract void addAnimal();
	public abstract void removeAnimal();
	
}
