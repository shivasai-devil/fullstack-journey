package javabasics.nestedloops;

import java.util.Scanner;

public class ReverseRightAlignedStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        for (int i = rows; i >= 1; i--) {
            printAlignedStars(rows, i);
        }
        scanner.close();
    }

    static void printAlignedStars(int rows, int i) {
        for (int j = 1; j <= rows-i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
