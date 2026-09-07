// * Star Pattern

// public class pattern {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 5; i++) {
//             for(int j =1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//* Inverted Star Pattern

// public class pattern {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 5; i++) {
//             for(int j =5; j >= i; j--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//* Half Pyramid Pattern

// public class pattern {
//     public static void main(String[] args) {
//         for(int i=1; i<=4; i++) {
//            for(int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//            }
//         }
//     }



//* Chracter Pattern 

public class pattern {
    public static void main(String[] args) {
        char ch = 'A';
        for(int i = 1; i <= 6; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}


