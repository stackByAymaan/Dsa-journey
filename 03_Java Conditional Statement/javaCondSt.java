import java.util.*;

public class javaCondSt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 ==0) {
            System.out.println(num + " is Even.");
        } else if (num % 2 != 0) {
            System.out.println(num + " is Odd.");
        } else {
            System.out.println("The number is either zero or negative.");
        }

        sc.close();
    }
}