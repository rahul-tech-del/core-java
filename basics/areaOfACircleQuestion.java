package basics;

import java.util.Scanner;

public class areaOfACircleQuestion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // System.out.print("Enter a radius:");
            // double r = sc.nextDouble();
            // double a = 3.14*r*r;
            // System.out.println(a);
            System.out.print("Enter the principal amount:");
            double p = sc.nextDouble();
            System.out.print("Enter rate of interest:");
            double r = sc.nextDouble();
            System.out.print("Enter time:");
            double t = sc.nextDouble();
            double si = p*r*t/100;
            System.out.println(si);
        }
    }
    
}
