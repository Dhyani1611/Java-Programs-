package Day2;

import java.util.Scanner;

public class Weird3 {
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     
     if (num % 2 == 0){
       if(num<=5 && num>=2){
         System.out.println("NOT WEIRD");
       }
       else if(num<=20 && num>=6){
         System.out.println("WEIRD");
       }
       else{
         System.out.println("not WEIRD");
       }
    }
    else{
     System.out.println("WEIRD"); 
    } 
   } 
}
