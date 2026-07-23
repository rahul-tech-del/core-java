package Conditionals;

import java.util.Scanner;

public class youngestOfTheThree {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the age Ram :");
            int Ram = sc.nextInt();
            System.out.print("Enter the age Shyam:");
            int Shyam = sc.nextInt();
            System.out.print("Enter the age Ajay :");
            int Ajay = sc.nextInt();

            if(Ram < Shyam){
                if(Ram < Ajay) {
                    System.out.println("Ram is youngest");
                }else{
                    System.out.println("Ajay is youngest");
    
                }
            }
            else{
               if(Shyam < Ajay) {
                System.out.println("shyam is youngest");
               }else{
                System.out.println("Ajay is youngest");
               }
            }
        }
            
        

    }
    
}
