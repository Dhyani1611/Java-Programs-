package Day4;

import java.util.Scanner;

public class dtob4 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int rev = 0;
        while(n>0){
            int r = n%2;
            rev = rev*10+r;
            n=n/2;
        }

        int binary = 0;
        while (rev > 0) {
            int r = rev % 10;
            binary = binary * 10 + r;
            rev = rev / 10;
        }

        System.out.println("Binary of " + n + " is: " + binary);
        sc.close();
    }
}

