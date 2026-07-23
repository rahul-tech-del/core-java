package Conditionals;

import java.util.Scanner;
public class profitLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter cost price :");
            int cp = sc.nextInt();
            System.out.println("Enter selling price :");
            int sp = sc.nextInt();
            if(cp == sp){
                System.out.print("No Profit and No Loss");
                
            }
            if(sp > cp){
                System.out.print("Profit is :");
                System.out.print(sp-cp);
                
            } 
            if(cp > sp){
                System.out.print("Loss is :");
                System.out.print( cp-sp );
            }
        }
        
    }
    
}
