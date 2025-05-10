// Special number between particular range 
package Day2;
import java.util.*;

public class special6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int fr = sc.nextInt();
      int lr = sc.nextInt();
      for (int num = fr; num<=lr; num++){
        int digit1 = num/10;
        int digit2 = num%10;
        int sum = digit1 + digit2;
        int product = digit1 * digit2;
        if ((sum+product)==num){
          System.out.println("Special numbers between particular range: " +num);
        }
      }
    }
}