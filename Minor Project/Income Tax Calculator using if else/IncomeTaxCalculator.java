import java.util.*;

public class IncomeTaxCalculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you income :");
        int income = sc.nextInt();
        int tax;
        int RemainingIncome;

        if(income <= 500000) {
            System.out.println("No tax");
            tax =  (income * 0) / 100;
            System.out.println("Tax deducted : " + tax);
            RemainingIncome = income - tax;
            System.out.println("Remaining Income : " + RemainingIncome);
        } else if (income > 500000 && income <= 1000000) {
            System.out.println("Tax is 20%");
            tax =  (income * 20) / 100;
            System.out.println("Tax deducted : " + tax);
            RemainingIncome = income - tax;
            System.out.println("Remaining Income : " + RemainingIncome);
        } else {
            System.out.println("Tax is 30%");
            tax =  (income * 30) / 100;
            System.out.println("Tax deducted : " + tax);
            RemainingIncome = income - tax;
            System.out.println("Remaining Income : " + RemainingIncome);
        }  
        sc.close();
    }
}