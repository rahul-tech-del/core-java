package Conditionals;

import java.util.Scanner;

public class findTheQuadrant {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the x-Quadrant :");
            int x = sc.nextInt();
            System.out.print("Enter the y-Quadrant :");
            int y = sc.nextInt();
            
            if(x==0 && y==0) System.out.println("Origin");
            else if(x==0) System.out.println("Y-axis");
            else if(y==0) System.out.println("X-axis");
            else if(x>0 && y>0) System.out.println("1st Quadrant :");
            else if(x<0 && y>0) System.out.println("2nd Quadrant :");
            else if(x<0 && y<0) System.out.println("3rd Quadrant :");
            else System.out.println("4th Quadrant :");
        }
        
    }
    
}
