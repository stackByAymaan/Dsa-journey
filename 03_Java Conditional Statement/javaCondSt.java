import java.util.*;

public class javaCondSt {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter A: ");
        // int A = sc.nextInt();

        // System.out.print("Enter B: ");
        // int B = sc.nextInt();

        // System.out.print("Enter C: ");
        // int C = sc.nextInt();

        // if (A > B && A > C) {
        //     System.out.println(A + " is the largest number.");
        // } else if (B > A && B > C) {
        //     System.out.println(B + " is the largest number.");
        // } else {
        //     System.out.println(C + " is the largest number.");
        // }
      
        int number = 4;
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.print(type);


        // sc.close();
    }
}