package Conditionals;

import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number :");
            int n = sc.nextInt();

            if(n<0){
                System.out.println(-n);
            }else{
                System.out.println(n);
            }
        }

    }
    
}
