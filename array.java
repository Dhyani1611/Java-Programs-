package Day5;

import java.util.Scanner;

public class array {
        public static void main(String[] args) {
            int[] evenNumbers = new int[10]; // There are 10 even numbers between 1 and 20
            int index = 0;
    
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    evenNumbers[index] = i;
                    index++;
                }
            }
    
            System.out.println("Even numbers from 1 to 20 in array:");
            for (int num : evenNumbers) {
                System.out.print(num + " ");
            }
        }
    }
    
