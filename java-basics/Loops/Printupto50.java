import java.util.Scanner;

public class Printupto50 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum limit: ");
        int maxLimit = scanner.nextInt();
        for(int counter = 1;counter <= maxLimit;counter++){
            System.out.print(counter+" ");
        }
        System.out.println();
        scanner.close();
    }
}
