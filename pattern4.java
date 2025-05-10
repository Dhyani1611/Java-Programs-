package Day5;

public class pattern4 {
    public static void main(String[] args) {
         int rows = 5; // Number of rows in the pattern

    for (int i = 1; i <= rows; i++) { 
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}
}

