//^ Function/Methods

// import java.util.Scanner;

// public class Main {
//     public static int calculateSum( int a, int b) { //parameter or formal parameter
//         int sum = a + b;    
//         System.out.println("The sum of " + a + " and " + b + " is: " + sum);
       
//         return sum;
//     }

//     public static void main(String[] args) {
//         System.out.print("Enter a:");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.print("Enter b:");
//         int b = sc.nextInt();
//         int sum = calculateSum(a , b);  //argument or actual parameter


//         sc.close();
//     }
// }


//* Call by value 
public class Main {

    public static void main(String[] args) {
       //Swap values exchange 
        int a = 5;
        int b = 10;

        //Swap 
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);  
    }
}