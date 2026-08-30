package com.demo.practice;

import java.util.Scanner;

public class Avg_marks {

    static void calculateMarks(int m1, int m2, int m3) {
        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();

        calculateMarks(m1, m2, m3);
    }
}