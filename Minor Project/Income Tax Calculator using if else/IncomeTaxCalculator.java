import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        int tax;
        int RemainingIncome;

        if (income <= 400000) {
            System.out.println("Tax is 0%");

            tax = (income * 0) / 100;
            System.out.println("Tax deducted: " + tax);

            RemainingIncome = income - tax;
            System.out.println("Remaining Income: " + RemainingIncome);

        } else if (income <= 800000) {
            System.out.println("Tax is 5%");

            tax = (income * 5) / 100;
            System.out.println("Tax deducted: " + tax);

            RemainingIncome = income - tax;
            System.out.println("Remaining Income: " + RemainingIncome);

        } else if (income <= 1200000) {
            System.out.println("Tax is 10%");

            tax = (income * 10) / 100;
            System.out.println("Tax deducted: " + tax);

            RemainingIncome = income - tax;
            System.out.println("Remaining Income: " + RemainingIncome);

        } else if (income <= 1600000) {
            System.out.println("Tax is 15%");

            tax = (income * 15) / 100;
            System.out.println("Tax deducted: " + tax);

            RemainingIncome = income - tax;
            System.out.println("Remaining Income: " + RemainingIncome);

        } else if (income <= 2000000) {
            System.out.println("Tax is 20%");

            tax = (income * 20) / 100;
            System.out.println("Tax deducted: " + tax);

            RemainingIncome = income - tax;
            System.out.println("Remaining Income: " + RemainingIncome);

        } else if (income <= 2400000) {
            System.out.println("Tax is 25%");

            tax = (income * 25) / 100;
            System.out.println("Tax deducted: " + tax);

            RemainingIncome = income - tax;
            System.out.println("Remaining Income: " + RemainingIncome);

        } else {
            System.out.println("Tax is 30%");

            tax = (income * 30) / 100;
            System.out.println("Tax deducted: " + tax);

            RemainingIncome = income - tax;
            System.out.println("Remaining Income: " + RemainingIncome);
        }

        sc.close();
    }
}