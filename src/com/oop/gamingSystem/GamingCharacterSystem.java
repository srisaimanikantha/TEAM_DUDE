package com.oop.gamingSystem;

import java.util.Scanner;

public class GamingCharacterSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Warrior");
        System.out.println("2. Wizard");
        System.out.println("3. Archer");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter character name: ");
        String name = sc.nextLine();

        System.out.print("Enter health: ");
        int health = sc.nextInt();

        Character character;

        switch (choice) {

            case 1:
                character = new Warrior(name, health);
                break;

            case 2:
                character = new Wizard(name, health);
                break;

            case 3:
                character = new Archer(name, health);
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        System.out.println("\n----- CHARACTER DETAILS -----");
        character.displayInfo();

        System.out.println("\n----- ATTACK -----");
        character.attack();

        System.out.print("\nEnter new health: ");
        int newHealth = sc.nextInt();

        character.setHealth(newHealth);

        System.out.println("\n----- UPDATED DETAILS -----");
        character.displayInfo();

        sc.close();
    }
}