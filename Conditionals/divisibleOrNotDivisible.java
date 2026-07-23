package Conditionals;

import java.util.Scanner;

public class divisibleOrNotDivisible {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number ");
            int n = sc.nextInt();
            if(n%5==0)
                System.out.println("Yes it is divisible by 5");
            else
                System.out.println("No, not divisible by 5");
        }    
    
        
          
    }
    
}
