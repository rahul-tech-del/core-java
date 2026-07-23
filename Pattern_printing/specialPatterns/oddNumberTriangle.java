package Pattern_printing.specialPatterns;

import java.util.Scanner;

public class oddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row :");
        int n = sc.nextInt();
        // method-1
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(2*j-1 +" ");
            }
            System.out.println();
        }     

        //   Method-2 
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print(j +" ");
        //     }
        //     System.out.println();
        // }     

        //  Method-3
        // for(int i=1;i<=n;i++){
        //     int a = 1; 
        //     for(int j=1;j<=i;j++){
        //         System.out.print(2*j-1 +" ");
        //         a +=2;
        //     }
        //     System.out.println();
        // }     
    }
    
}
