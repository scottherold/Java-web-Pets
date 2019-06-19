package com.sherold.web.models;

public abstract class Animal {
	// <----- Attributes ----->
	protected String name;
	protected String breed;
	protected double weight;
	
	// <----- Constructors ----->
	protected Animal() {
		
	}
	
	protected Animal(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}

	// <----- Getters/Setters ----->
	// name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// breed
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	// weight
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
