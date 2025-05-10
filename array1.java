package Day5;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.print("Enter the size of the first array: ");
          int size1 = scanner.nextInt();
          int[] array1 = new int[size1];
  
          System.out.println("Enter elements of the first array:");
          for (int i = 0; i < size1; i++) {
              array1[i] = scanner.nextInt();
          }
  
          System.out.print("Enter the size of the second array: ");
          int size2 = scanner.nextInt();
          int[] array2 = new int[size2];

          System.out.println("Enter elements of the second array:");
          for (int i = 0; i < size2; i++) {
              array2[i] = scanner.nextInt();
          }
          if (size1 != size2) {
              System.out.println("The arrays are NOT the same (different sizes).");
          } else {
              int sum1 = 0, sum2 = 0;
              for (int i = 0; i < size1; i++) {
                  sum1 += array1[i];
                  sum2 += array2[i];
              }
  
              if (sum1 == sum2) {
                  System.out.println("The arrays are the SAME (same size and sum).");
              } else {
                  System.out.println("The arrays are NOT the same (same size but different sums).");
              }
          }
          scanner.close();
    }
}