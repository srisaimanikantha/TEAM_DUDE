package com.oop.gamingSystem;

class Wizard extends Character {

    public Wizard(String name, int health) {
        super(name, health, 80);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks using magic and causes 80 damage.");
    }
}
