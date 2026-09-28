public class Main {

    public static void printSpiral(int n) {

        int[][] arr = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {

            // Left to right
            for (int j = left; j <= right; j++) {
                arr[top][j] = num++;
            }
            top++;

            // Top to bottom
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;

            // Right to left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    arr[bottom][j] = num++;
                }
                bottom--;
            }

            // Bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = num++;
                }
                left++;
            }
        }

        // Print the spiral
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSpiral(5);
    }
}