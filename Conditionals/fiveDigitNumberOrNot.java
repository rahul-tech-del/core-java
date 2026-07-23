package Conditionals;

import java.util.Scanner;

public class fiveDigitNumberOrNot {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number :");
            int n = sc.nextInt();
            if(n > 9999  && n < 100000) System.out.println("Five Digit Number ");
            else System.out.println("Not a Five Digit Number ");
        }

    }
    
}
