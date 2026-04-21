package com.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rows = 3, cols = 3;
        int[][] table = new int[rows][cols];
        Random rand = new Random();

        // 1. Initialize with random values
        System.out.println("Original Table:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                table[i][j] = rand.nextInt(100);
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }

        // 2. Optimized 2D Bubble Sort (Nested in main)
        int n = rows * cols;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Convert 1D loop index 'j' into 2D (row, col)
                int r1 = j / cols;
                int c1 = j % cols;
                
                // Get coordinates for the next element (j + 1)
                int r2 = (j + 1) / cols;
                int c2 = (j + 1) % cols;

                // Compare and Swap
                if (table[r1][c1] > table[r2][c2]) {
                    int temp = table[r1][c1];
                    table[r1][c1] = table[r2][c2];
                    table[r2][c2] = temp;
                }
            }
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