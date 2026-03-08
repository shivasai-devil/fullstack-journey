import java.util.Scanner;

public class PrintEvenUptoMaxLimit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum limit: ");
        int maxLimit = scanner.nextInt();
        for(int counter = 2;counter <= maxLimit;counter += 2){
                System.out.print(counter + " ");
        }
        System.out.println();
        scanner.close();
    }
}
