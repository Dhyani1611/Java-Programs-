//Collatz Sequence Generation
package Day2;
import java.util.Scanner;

public class collatz8 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int counts = 0;
      System.out.println(n);
      
      while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println("Number:" + n);
            counts++;
        }
        System.out.println("Number of counts: " + counts);
    }
}
