package com.vibe.the.release.classes;

import com.vibe.the.release.enums.GrowthStage;

public abstract class Mammals extends Animal
{
	//Variables
	
	//Constructors
	public Mammals(String name, String gender, int age, GrowthStage growthStage)//Generic constructor
	{
		
	}
	public Mammals()//No args constructor
	{
		
	}
	
	public abstract void eat();
	
	public abstract void grow();
	public abstract void reproduce();
	public abstract void sleep();
	public abstract void die();
	public abstract void move();
	public abstract void addAnimal();
	public abstract void removeAnimal();
	//Methods
	
}
