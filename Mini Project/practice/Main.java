public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            // Spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}