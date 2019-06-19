package com.sherold.web.models;

public class Dog extends Animal implements Pet {
	// <----- Constructors ----->
	public Dog() {
	}

	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
	}

	// Override showAffection for Cat class
	@Override
	public String showAffection() {
		if (weight < 30) {
			return name + " hopped into your lap and cuddled you!";
		} else {
			return name + " curled up next to you and cuddled against you.";
		}		
	}
}
