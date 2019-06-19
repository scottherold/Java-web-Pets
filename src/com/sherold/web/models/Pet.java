package com.sherold.web.models;

public interface Pet {
	// <----- Default methods for overriding ----->
	default String showAffection() {
		
		// Returns null, to be overriden
		return null;
	}
	
}
