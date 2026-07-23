package Conditionals;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            
            if(n%2 == 0)
             System.out.println("Number is even");
            if(n%2 == 1) 
            System.out.println("Number is odd");
        }
    }


    
}
