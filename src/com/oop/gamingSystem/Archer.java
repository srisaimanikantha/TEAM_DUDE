package com.oop.gamingSystem;

class Archer extends Character {

    public Archer(String name, int health) {
        super(name, health, 60);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with arrows and causes 60 damage.");
    }
}