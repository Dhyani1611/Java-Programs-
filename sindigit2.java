//read single digit integer if 0 print 0 if even print even & same for odd
package Day2;
import java.util.Scanner;
public class sindigit2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number:");
     int num = sc.nextInt();
     if (num == 0){
       System.out.println("Number is zero");
      }
     else if (num % 2 == 0){
       System.out.println("Number is even");
      }
     else{
       System.out.println("Number is odd");
      }
    }
}
