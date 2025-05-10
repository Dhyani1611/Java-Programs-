package Day1;
import java.util.*;
public class digits3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digits num:");
        int num = sc.nextInt();
        int f = num/100;
        int m = (num%100)/10;
        int l = num%10;
        System.out.println(l+f+m);
    }
}