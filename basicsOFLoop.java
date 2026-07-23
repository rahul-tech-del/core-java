package Loops;

import java.util.Scanner;

public class basicsOFLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number :");
            int n = sc.nextInt();

            for(int i=1; i<=n; i++)
                System.out.println("Hello World");
        }

    }
    
}
