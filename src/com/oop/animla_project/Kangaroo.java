package com.oop.animla_project;

public class Kangaroo extends Animal{

	    private int kills;
	    private String habitat;
	    private double jumpHeight;

	    public Kangaroo(String name, String gender, int kills, String habitat, double jumpHeight) {
	        super(name, gender, 2);
	        this.kills = kills;
	        this.habitat = habitat;
	        this.jumpHeight = jumpHeight;
	    }

	    @Override
	    String getSound() {
	        return "Kangaroo Click! Chortle!";
	    }

	    @Override
	    void animalDetails() {
	        System.out.println("====== Kangaroo ======");
	        System.out.println("Name: " + this.getName());
	        System.out.println("Gender: " + this.getGender());
	        System.out.println("Legs: " + this.getLegs());
	        System.out.println("Kills: " + this.kills);
	        System.out.println("Habitat: " + this.habitat);
	        System.out.println("Jump Height: " + this.jumpHeight + " meters");
	        System.out.println("Sound: " + this.getSound());
	    }
	}
