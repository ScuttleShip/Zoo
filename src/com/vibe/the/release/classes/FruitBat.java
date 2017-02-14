package com.vibe.the.release.classes;

import com.vibe.the.release.enums.GrowthStage;

public class FruitBat extends Bats
{
	//Variables
	
	//Constructors
	public FruitBat(String name, String gender, int age, GrowthStage growthStage, String type)
	{
		this.growthStage = growthStage;
	}
	
	public FruitBat()//No args Constructor
	{
		
	}
	
	//Methods
	public void eat()
	{
		System.out.println("A Fruit bat mainly eats fruit");
	}
	
	public void sleep()
	{
		System.out.println("They sleep during the day and forage mainly at night");
	}
	
	public void Grow()
	{
		if(age >= 4)
		{
			growthStage = GrowthStage.Grown_Fruit_Bat;
		}
		else if (age < 4)
		{
			growthStage = GrowthStage.Baby_Fruit_Bat;
		}
		else
		{
			System.out.println(growthStage);
		}
		
		//Add a statement that says if die is called stage == death. Perhaps more appropriate in die
	}
	
	public void reproduce()
	{
		
	}
	public void die(String name, String type)
	{
		/*if(name == Animal.name)
		{
			growthStage = GrowthStage.Death;
			removeAnimal(name, type);
		}*/
	}
	
	public void grow()
	{
		
	}

	public void die()
	{
		
	}

	public void move()
	{
		
	}

	public void addAnimal()
	{
		
	}

	public void removeAnimal()
	{
		
	}
	
	
}
