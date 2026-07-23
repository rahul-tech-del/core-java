package basics;

import java.util.Scanner;

public class inputSquare {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter a Number :");
            int n = sc.nextInt();
            System.out.println(n*n);
        }
        
    }
    
    
    
}
