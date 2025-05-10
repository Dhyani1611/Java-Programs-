package Day4; 
import java.util.Scanner;
public class kaprekar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int sq = num*num;
        int temp = sq;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int pow = 1;
        for (int i = 1; i < count; i++) {
            pow = pow * 10;
            int left = sq/ pow;
            int right = sq % pow;

            if (right > 0 && (left + right == num)) {
                System.out.println(num + " is a Kaprekar Number");
                sc.close();
                return;
            }
        }

        System.out.println(num + " is not a Kaprekar Number");
        sc.close();
    }
}