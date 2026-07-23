package Loops;

import java.util.Scanner;

public class CompositeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();

        int x = 0; //0 means prime

        for(int i=2; i<=n-1; i++){
            if(n%i==0){  // 'i is a factor of 'n'
                System.out.println("Composite Number");
                    System.out.println("Not Composite ");    
                    x = 1; // 1 means composite 
                    break;

            
            }
        }
    }
    
}
