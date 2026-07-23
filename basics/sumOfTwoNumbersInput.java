package basics;

import java.util.Scanner;

public class sumOfTwoNumbersInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the 1st number :");
            int a = sc.nextInt();
            System.out.print("Enter the 2nd number :");
            int b  = sc.nextInt();
            System.out.print("Enter the 3rd Number ");
            int c = sc.nextInt();

            if(a>=b && a>=c)
                System.out.println(a+ "is greatest");
            else if(b>=a && b>=c)
                System.out.println(b+ "is greatest");
            else System.out.println(c+"is greatest");
        }


        
    }
    
    
}
