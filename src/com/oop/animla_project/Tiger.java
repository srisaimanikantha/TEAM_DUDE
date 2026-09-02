package com.oop.animla_project;

public class Tiger extends Animal {

	    private int kills;
	    private String species;
	    private double speed;

	    public Tiger(String name, String gender, int kills, String species, double speed) {
	        super(name, gender, 4);
	        this.kills = kills;
	        this.species = species;
	        this.speed = speed;
	    }

	    @Override
	    String getSound() {
	        return "Tiger Vuraaa";
	    }

	    @Override
	    void animalDetails() {
	        System.out.println("====== Tiger ======");
	        System.out.println("Name: " + this.getName());
	        System.out.println("Gender: " + this.getGender());
	        System.out.println("Legs: " + this.getLegs());
	        System.out.println("Kills: " + this.kills);
	        System.out.println("Species: " + this.species);
	        System.out.println("Speed: " + this.speed + " km/h");
	        System.out.println("Sound: " + this.getSound());
	    }
	}

