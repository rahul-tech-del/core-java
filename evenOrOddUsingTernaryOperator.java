package Conditionals;

import java.util.Scanner;

public class evenOrOddUsingTernaryOperator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number :");
            int n = sc.nextInt();


            // condition ? if true : if false 

            System.out.println((n%2==0) ? "Even" : "Odd");
        }
    
    }

    
}
