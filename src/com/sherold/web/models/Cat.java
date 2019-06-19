package com.sherold.web.models;

public class Cat extends Animal implements Pet {
	// <----- Constructors ----->
	public Cat() {
	}

	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
	}

	// <----- Methods ----->
	
	// Override showAffection for Cat class
	@Override
	public String showAffection() {
		return "Your " + breed + " cat, " + name + ", looked at you with some affection. You Think...";
	}
}
