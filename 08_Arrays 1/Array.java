//^ Array 

//* Creating Array
// public class Array {
//     public static void main(String[] args) {
//         int marks[] = new int[100];

//         int number[] = { 1, 2, 3};

//         String fruits[] = {"Apple", "Orange"," Papaya"};
//     }
// }


//* Performing Operations

import java.util.*;
public class Array {
    public static void main(String[] args) {

        int marks[] = new int [5];

        System.out.print("Enter your Marks in Physics chemistry & Bio respectively : ");
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("Bio : " + marks[2]);

        //Update
        // marks[2] = 100;
        marks[2] = marks[2] + 20;
        System.out.println("Updated marks in Bio : " + marks[2]);

        System.out.println("length of array = " + marks.length);

        sc.close();
    }
}
