package Day5;
public class pattern3 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("* ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print(" "); // Star followed by a space
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}