//Hotel tariff Calculator 
package Day2;
import java.util.Scanner;
public class hoteltariff5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        int rentPerDay = sc.nextInt();
        int numDays = sc.nextInt();

        if (mon < 1 || mon > 12) {
            System.out.println("Invalid Input");
            return;
        }
        boolean isPeakMon = (mon == 4 || mon == 5 || mon == 11 || mon == 12);

        if (isPeakMon){
            rentPerDay += rentPerDay * 0.2; // Increase by 20%
        }
        int total = rentPerDay * numDays;
        System.out.println(total);
    }
}


