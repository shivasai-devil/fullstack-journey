public class swapNumbers {
    public static void main (String[] args){
        int first_number=15;
        int second_number=17;
        System.out.println("Numbers Before Swapping First Number: "+first_number+
                " Second Number: "+second_number);
        int temp_number=first_number;
        first_number=second_number;
        second_number=temp_number;
        System.out.println("Numbers after Swapping First Number: "+first_number+
                " Second Number: "+second_number);
    }
}
