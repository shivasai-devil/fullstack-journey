import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.print("Enter limit: ");
        int maxLimit = scanner.nextInt();

        for(int counter = 1;counter <= maxLimit;counter++){

            System.out.println(num+" x "+counter+" = "+(num * counter));

        }
        scanner.close();
    }
}
