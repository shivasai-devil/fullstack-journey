package javabasics.loops;

import java.util.Scanner;

public class SumUptoMaxLimit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum limit: ");
        int maxLimit = scanner.nextInt();
        int totalSum = 0;
        for(int counter = 1;counter <= maxLimit;counter++){
            totalSum += counter;
        }
        System.out.println("Sum of numbers from 1 to "+maxLimit+" is "+totalSum);
        scanner.close();
    }
}
