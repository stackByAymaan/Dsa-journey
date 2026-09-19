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
// public class Main {

//     public static void swap(int a, int b) {
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a = " + a);
//         System.out.println("b = " + b);  
//     }

//     public static void main(String[] args) {

//         int a = 5;
//         int b = 10;
//         swap(a, b);
//     }
// }


//? Product of two numbers using function

// public class Main {

//     public static int multiply(int a, int b) {
        
//         int product = a * b;

//         System.out.println( "Product of a and b = " + product); 
//         return product;
//     }

//     public static void main(String[] args) {
       
//         multiply(10, 20);
//     }
// }


//? Factorial of a number using function (n! = n * (n-1) * (n-2) * ... * 1)

// public class Main {

//     public static int factorial(int n) {
//         int f = 1;
//         for(int i = 1; i <= n; i++) {
//             f = f * i;
//         }
//         return f;
//     }

//     public static void main(String[] args) {
//        System.out.println(factorial(5));
        
//     }
// }

//? Binomial coefficient -> nCr = n! / (r! * (n-r)!) 


//* Function Overloading

// public class Main {

//     public static int add(int a, int b) {
//         return a + b;
//     }

//     public static int add(int a, int b, int c) {
//         return a + b + c;
//     }

//     public static void main(String[] args) {
//         System.out.println(add(5, 10));
//         System.out.println(add(5, 10, 15));
//     }
// }


// Overloading using different data types
// public class Main {

//     public static int add(int a, int b) {
//         return a + b;
//     }

//     public static double add(double a, double b) {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         System.out.println(add(5, 10));        // int
//         System.out.println(add(5.5, 10.5));    // double
//     }
// }


//? Check if number is prime or not
// public class Main {

//     public static boolean isPrime(int n) {
//     boolean isPrime = true;
//     for(int i = 2; i<=n-1; i++) {
//         if(n % i == 0) {
//             isPrime = false;
//             break;
//         }
//     }
//     return isPrime;
//     }


//     public static void main(String[] args) {
//         System.out.println(isPrime(7));  
//         System.out.println(isPrime(4));  
//         System.out.println(isPrime(11));  
//     }
// }


//* Optimized Prime number code 
// public class Main {

// public static boolean isPrime(int n) {

//     if(n == 2) {
//         return true;
//     }

//     for(int i = 2; i <= Math.sqrt(n); i++) {

//         if(n % i == 0) {
//             return false;
//         }
//     }

//     return true;
// }

//     public static void main(String[] args) {
//         System.out.println(isPrime(7));  
//         System.out.println(isPrime(4));  
//         System.out.println(isPrime(11));  
//     }
// }


//* Print all primes in a range

// public class Main {
//     public static boolean isPrime(int n) {

//         if(n == 2) {
//             return true;
//         }

//         for(int i = 2; i <= Math.sqrt(n); i++) {

//             if(n % i == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void primeInRange(int n) {

//         for(int i = 2; i <= n; i++) {

//             if(isPrime(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {

//         System.out.println(isPrime(7));
//         primeInRange(30);
//     }
// }  



//* Binary to decimal

// public class Main {

//     public static void binToDec(int binNum) {
//         int pow = 0;
//         int decNum = 0;
//         int originalBin = binNum;

//         while (binNum > 0) {
//             int lastDigit = binNum % 10;
//             decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
//             pow++;
//             binNum = binNum / 10;
//         }
//         System.out.println("decimal of " + originalBin + " = " + decNum);
//     }
//     public static void main(String[] args) {
//         binToDec(101);
//     }
// }


//* Decimal to Binary

// public class Main {
//     public static void decToBin(int n) {

//         int pow = 0;
//         int binNum = 0;
//         int originalNum = n;

//         while (n > 0) {
//             int lastDigit = n % 2;
//             binNum = binNum + (lastDigit * (int) Math.pow(10, pow));
//             pow++;
//             n = n / 2;
//         }
//         System.out.println("Binary of " + originalNum + " = " + binNum);
//     }
//     public static void main(String[] args) {
//         decToBin(11);
//     }
// }


//*  Scope

public class Main {
    public static void myMethod() {

        int a = 10; // Method scope

        if (true) {
            int b = 20; // Block scope
            System.out.println(a); // Accessible
            System.out.println(b); // Accessible
        }

        System.out.println(a); // Accessible
        // System.out.println(b); // Error
    }
    public static void main(String[] args) {
        myMethod();
    }
}