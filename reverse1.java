package Day2;
//Reverse of 3 digit number  
import java.util.*;
public class reverse1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digits num:");
        int num = sc.nextInt();
        int f = num/100;
        int m = (num%100)/10;
        int l = num%10;
        int rev = l*100+m*10+f;
        System.out.println("Reverse:"+rev);
    }
}
