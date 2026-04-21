package com.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rows = 2, cols = 2;
        int[][] table = new int[rows][cols];
        int[] flat = new int[rows * cols];
        Random rand = new Random();

        // 1. Fill with random values and flatten
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                table[i][j] = rand.nextInt(100);
                flat[i * cols + j] = table[i][j];
            }
        }

        // 2. Sort the flattened array
        Arrays.sort(flat);

        // 3. Put sorted values back into the 2D table
        for (int i = 0; i < flat.length; i++) {
            table[i / cols][i % cols] = flat[i];
        }

        // 3. Print the Sorted Table
        System.out.println("\nSorted Table (Manual 2D Sort):");
        for (int[] row : table) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}