package Day4;

import java.util.Scanner;

public class kaprekar3 {
    public static void main(String[] args) {
        System.out.println("Enter 3 digit number:");
    Scanner sc =new Scanner(System.in);
    int num= sc.nextInt();
    int nsq=  num*num;


    int left=nsq%1000;
    int right=nsq/1000;

    int sum=left+right;
    if(sum==num)
    {
        System.out.println("It is Kaprekar num");
    }
    else{
        System.out.println("It is not  Kaprekar num");
    }
 sc.close();
}
}
    