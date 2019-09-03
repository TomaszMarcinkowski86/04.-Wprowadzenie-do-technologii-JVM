package com.sda;

/**
* This class models a person with given name.
* @author Piotr Zietek
*/
public class Person {
	
	private String name;

	/**
	* Creates a person instance with provided {@code name}.
	* @param name name of a person to create
	*/
	public Person(String name) {
		this.name = name;
	}
	
	/**
	* Returns a name for a person.
	* @return person's name
	*/
	public String getName() {
		return this.name;
	}
		

}