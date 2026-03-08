package javabasics.conditionals;

public class SalaryBonus {
    public static void main(String[] args){
        long salary = 38291;
        long salaryReference = 50000;
        int bonusHigh = 5000;
        int bonusLow = 2000;
        int bonusDefault = 0;
        if (salary > salaryReference){
            System.out.println("Congratulations!! Your Bonus is "+bonusHigh);
        }else if (salary <= salaryReference){
            System.out.println("Congratulations!! Your Bonus is "+bonusLow);
        }else{
            System.out.println("Alas!! Your Bonus is "+bonusDefault);
        }
    }
}
