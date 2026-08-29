import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        int rad = sc.nextInt();

        Double pi = 3.14;

        Double area = pi * rad * rad;

        System.out.println("Area of circle : " + area);

        sc.close();
    }
}