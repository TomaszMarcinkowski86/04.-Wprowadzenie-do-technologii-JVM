package com.sda;
public class Person { 

    private String name ="Gal"; // prywatne zmienne


    public Person(String name){
        this.name=name; 
    }
   
    public String getName(){         // getter (get) s¹ bezparametrowe
        return name;
    }
	}
