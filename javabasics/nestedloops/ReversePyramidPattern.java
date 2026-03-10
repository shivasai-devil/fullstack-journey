package javabasics.nestedloops;

import java.util.Scanner;

public class ReversePyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        for (int i = rows; i >= 1; i--) {
            PyramidPattern.printCenteredStars(rows,i);
        }
        scanner.close();
    }
}
