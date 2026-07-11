package Conditionals;

import java.util.Scanner;

public class threeDigitNumberOrNot {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number :");
            int n = sc.nextInt();
            if(n > 99  && n < 1000) System.out.println("Three Digit Number ");
            else System.out.println("Not a Three Digit Number ");
        }

    }

}
