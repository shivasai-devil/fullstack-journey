package javabasics.conditionals;

public class evenOddChecker {
    public static void main(String[] args){
        int temp_number=455;
        String oddEven=(temp_number%2==0)?"Even":"Odd";
        System.out.println("Given number is "+oddEven);
    }
}
