// Trendy number if  middle digit is divisble by 3 
package Day2;
import java.util.Scanner;

public class trendy4 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      int num = sc.nextInt();
      int  middle= (num%100)/10;
          
       if(middle%3==0)
       {
        System.out.println("trendy number");
       }
       else
       {
        System.out.println("Not trendy number");
       }
    }
}
