// Fibonacci Sum
package Day2;

import java.util.Scanner;
public class fibonacci7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        
        int n1 = 0 , n2 = 1;
        int sum = 0;
        int i = 3;
        while (i<=month){
          sum = n1+n2;
          n1 = n2;
          n2 = sum;
          i++;
        }
    System.out.println(sum);
    }
}

