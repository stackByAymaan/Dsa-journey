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

// import java.util.*;
// public class Array {
//     public static void main(String[] args) {

//         int marks[] = new int [5];

//         System.out.print("Enter your Marks in Physics chemistry & Bio respectively : ");
//         Scanner sc = new Scanner(System.in);

//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();

//         System.out.println("phy : " + marks[0]);
//         System.out.println("chem : " + marks[1]);
//         System.out.println("Bio : " + marks[2]);

//         //Update
//         // marks[2] = 100;
//         marks[2] = marks[2] + 20;
//         System.out.println("Updated marks in Bio : " + marks[2]);

//         System.out.println("length of array = " + marks.length);

//         sc.close();
//     }
// }

//* Passing Arrays as an argument

// public class Array {
//     public static void update (int marks[] , int nonChangable) {
//         nonChangable = 10;
//         for(int i = 0; i <marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String args[]) {
//         int marks[] = {97, 98, 99};
//         int nonChnagable = 5;
//         update(marks, nonChnagable);
//         System.out.println( nonChnagable);

//         //print our marks
//         for(int i = 0; i<marks.length; i++) {
//             System.out.print(marks[i] + " ");
//         }
//         System.out.println();
//     }
// }


//* Linear Search

// public class Array {
     
//     public static int linearSearch(int numbers[], int key) {
//         for(int i = 0; i<numbers.length; i++) {
//             if (numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6,8, 10, 12, 14, 16};
//         int key = 10;
       
//         int index = linearSearch(numbers, key);
//         if(index == -1) {
//             System.out.println("not Found");
//         } else {
//             System.out.println("key is at index : " +  index);
//         }
//     }
// }


//* Largest Number

public class Array {
     
    public static void main(String args[]) {
        
    }
}
