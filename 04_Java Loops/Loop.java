import java.util.*;

public class Loop {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }

}
