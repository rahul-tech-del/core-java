package Conditionals;

import java.util.Scanner;

public class marksCheck {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the marks :");
           int n = sc.nextInt();
           
           if(n>=91 && n<=100) System.out.println("A");
           else if(n>=81 && n<=90) System.out.println("B");
           else if(n>=71 && n<=80) System.out.println("C");
           else if(n>=61 && n<=70) System.out.println("D");
           else if(n<70) System.out.println("not up to the marks");
           else System.out.println("Invaid Value");
       }
    }
    
}
