package javabasics.nestedloops;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            PyramidPattern.printCenteredStars(rows,i);
        }
        for (int i = rows - 1; i >= 1 ; i--) {
            PyramidPattern.printCenteredStars(rows,i);
        }
        scanner.close();
    }
}
