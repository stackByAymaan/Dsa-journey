import java.util.*;

public class Loop {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String even = "";
        String odd = "";
        for( int i = 1; i <= num; i++) {
            if(i % 2 ==0) {
                even = even + i + " ";
            } else if(i % 2 != 0) {
                odd = odd + i + " ";
            }
        }
        System.out.println("Even = " + even );
        System.out.println("Odd = " + odd);
        sc.close();
    }

}
