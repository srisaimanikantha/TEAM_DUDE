package com.oop.gamingSystem;

class Warrior extends Character {

    public Warrior(String name, int health) {
        super(name, health, 50);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with a sword and causes 50 damage.");
    }
}
