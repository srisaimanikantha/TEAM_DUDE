package com.oop.animla_project;

public class Lion extends Animal{

	    private int kills;
	    private int age;
	    private double weight;

	    public Lion(String name, String gender, int kills, int age, double weight) {
	        super(name, gender, 4);
	        this.kills = kills;
	        this.age=age;
	        this.weight=weight;
	    }

	    @Override
	    String getSound() {
	        return "Lion Roar! Rrr!";
	    }

	    @Override
	    void animalDetails() {
	        System.out.println("====== Lion ======");
	        System.out.println("Name: " + this.getName());
	        System.out.println("Gender: " + this.getGender());
	        System.out.println("Legs: " + this.getLegs());
	        System.out.println("Kills: " + this.kills);
	        System.out.println("Age: "+this.age+" Years");
	        System.out.println("Wigth of lion: "+this.weight+" Kg");
	        System.out.println("Sound: " + this.getSound());
	        
	    }
	}

