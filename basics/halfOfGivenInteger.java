package basics;

import java.util.Scanner;

public class halfOfGivenInteger {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value :");
            int x = sc.nextInt();
            double y = (double) x;
            System.out.println(y/2);
        }

        // double x = sc.nextDouble();
        // int y = (int) x;
        // System.out.println(y/2);
    }
    
}
