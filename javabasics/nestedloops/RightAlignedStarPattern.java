package javabasics.nestedloops;

import java.util.Scanner;

public class RightAlignedStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            ReverseRightAlignedStarPattern.printAlignedStars(rows, i);
        }
        scanner.close();
    }
}
