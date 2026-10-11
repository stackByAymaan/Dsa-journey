// Q1.Make a income tax calculaor using if-else 

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your income: ");
//         int income = sc.nextInt();
//         int tax;
//         int RemainingIncome;

//         if (income <= 400000) {
//             System.out.println("Tax is 0%");

//             tax = (income * 0) / 100;
//             System.out.println("Tax deducted: " + tax);

//             RemainingIncome = income - tax;
//             System.out.println("Remaining Income: " + RemainingIncome);

//         } else if (income <= 800000) {
//             System.out.println("Tax is 5%");

//             tax = (income * 5) / 100;
//             System.out.println("Tax deducted: " + tax);

//             RemainingIncome = income - tax;
//             System.out.println("Remaining Income: " + RemainingIncome);

//         } else if (income <= 1200000) {
//             System.out.println("Tax is 10%");

//             tax = (income * 10) / 100;
//             System.out.println("Tax deducted: " + tax);

//             RemainingIncome = income - tax;
//             System.out.println("Remaining Income: " + RemainingIncome);

//         } else if (income <= 1600000) {
//             System.out.println("Tax is 15%");

//             tax = (income * 15) / 100;
//             System.out.println("Tax deducted: " + tax);

//             RemainingIncome = income - tax;
//             System.out.println("Remaining Income: " + RemainingIncome);

//         } else if (income <= 2000000) {
//             System.out.println("Tax is 20%");

//             tax = (income * 20) / 100;
//             System.out.println("Tax deducted: " + tax);

//             RemainingIncome = income - tax;
//             System.out.println("Remaining Income: " + RemainingIncome);

//         } else if (income <= 2400000) {
//             System.out.println("Tax is 25%");

//             tax = (income * 25) / 100;
//             System.out.println("Tax deducted: " + tax);

//             RemainingIncome = income - tax;
//             System.out.println("Remaining Income: " + RemainingIncome);

//         } else {
//             System.out.println("Tax is 30%");

//             tax = (income * 30) / 100;
//             System.out.println("Tax deducted: " + tax);

//             RemainingIncome = income - tax;
//             System.out.println("Remaining Income: " + RemainingIncome);
//         }

//         sc.close();
//     }
// }


// Q2. Input 3 numbers: A, B, and C. Output their average.

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a: ");
//         int a = sc.nextInt();

//         System.out.print("Enter b: ");
//         int b = sc.nextInt();

//         System.out.print("Enter c: ");
//         int c = sc.nextInt();

//         int avg = (a + b + c) / 3;
//         System.out.println("Average of a , b and c : " + avg);

//         sc.close();
//     }
// }



// Q3.  Enter cost of 3 items from the user (using float data type) - a pencil, a pen and  an eraser. You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of eraser: ");
        float eraser = sc.nextFloat();

        float totalCost = pencil + pen + eraser;
        System.out.println("Total cost of items: " + totalCost);

        float gst = ( totalCost * 18) / 100;
        System.out.println("GST (18%): " + gst);

        sc.close();
    }
}

