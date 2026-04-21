package com.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        Random rand = new Random(); // Create random generator

        // Fill with random numbers between 0 and 100
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = rand.nextInt(101); 
            }
        }

        // Print the table
        System.out.println("Java Table:");
        for (int[] row : table) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}