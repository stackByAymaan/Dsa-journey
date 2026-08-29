// ^ ==================== DATA TYPES ====================

// public class JavaDataType02 {

//     public static void main(String args[]) {

//         byte b = 8;
//         System.out.println(b);

//         char ch = 'a';
//         System.out.println(ch);

//         boolean var = false;
//         System.out.println(var);

//         int number = 25;
//         System.out.println(number);

//         long bigNum = 1000000000L;
//         System.out.println(bigNum);

//         double d = 99.99;
//         System.out.println(d);

//         short n = 240;
//         System.out.println(n);

//         float f = 45.67f;
//         System.out.println(f);

//     }

// }

// * Java has 8 primitive data types:
// * byte, short, int, long, float, double, char, boolean
// * Each data type defines what kind of value a variable can store.


// ^ ==================== SUM OF a & b ====================

// public class JavaDataType02 {

//     public static void main(String args[]) {

//         int a = 10;
//         int b = 5;

//         int sum = a + b;

//         System.out.println(sum);

//     }

// }

// * Variables store values, and operators perform operations on those values.


// ^ ==================== INPUT IN JAVA ====================

// import java.util.*;

// public class JavaDataType02 {

//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         String input = sc.next();
//         System.out.println(input);

//         String name = sc.nextLine();
//         System.out.println(name);

//         int number = sc.nextInt();
//         System.out.println(number);

//         float price = sc.nextFloat();
//         System.out.println(price);

//     }

// }

// * Scanner is used to take input from the user.
// * next() reads one word.
// * nextLine() reads a complete line.
// * nextInt() reads an integer.
// * nextFloat() reads a floating-point value.


// ? SUM OF a & b USING SCANNER

// import java.util.*;

// public class JavaBasics {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter any number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter another number: ");
//         int b = sc.nextInt();

//         int sum = a + b;

//         System.out.println("Sum: " + sum);

//         sc.close();

//     }

// }


// ? AREA OF CIRCLE

// import java.util.*;

// public class JavaBasics {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter radius of circle: ");
//         int rad = sc.nextInt();

//         Double pi = 3.14;
//         Double area = pi * rad * rad;

//         System.out.println("Area of circle : " + area);

//         sc.close();

//     }

// }

// * 3.14 is treated as double by default.
// * For a float literal, use 3.14f.


// ^ ==================== TYPE CONVERSION ====================

// import java.util.*;

// public class JavaDataType02 {

//     public static void main(String args[]) {

//         int a = 25;
//         long b = a;

//         Explicit conversion

//         long a = 25;
//         int b = (int) a;

//         System.out.println(b);

//     }

// }

// * Widening conversion: smaller data type → larger data type.
// * Narrowing conversion: larger data type → smaller data type.
// * Widening is generally performed automatically.
// * Narrowing requires explicit conversion.


// ~ TYPE CASTING

// import java.util.*;

// public class JavaDataType02 {

//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         float a = 25.12f;
//         int b = (int) a;

//         System.out.println(b);

//     }

// }

// * Type casting explicitly converts one data type into another.
// * Converting float to int removes the decimal part.


// ^ ==================== TYPE PROMOTION IN EXPRESSION ====================

// public class JavaDataType02 {

//     public static void main(String args[]) {

//         char a = 'a';   // 97
//         int b = 'b';    // 98

//         System.out.println((int) a);
//         System.out.println((int) b);

//         System.out.println(b - a);

//     }

// }

// * In arithmetic expressions, byte, short and char are promoted to int.
// * This promotion happens before the operation is performed.


// public class JavaDataType02 {

//     public static void main(String args[]) {

//         short a = 5;
//         byte b = 25;
//         char c = 'c';

//         byte bt = (byte) (a + b + c);

//         System.out.println(bt);

//     }

// }

// ? a + b + c is promoted to int first.
// ? Therefore, assigning the result to byte requires explicit casting.