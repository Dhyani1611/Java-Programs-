package Day1;
import java.util.*;
public class digits4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 digits num:");
        int num = sc.nextInt();
        int l = num%10;
        int f = num/1000;
        System.out.println(l+f);
    }
}

