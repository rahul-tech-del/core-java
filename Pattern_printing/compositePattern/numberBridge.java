package Pattern_printing.compositePattern;

import java.util.Scanner;

public class numberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();

        for(int i=1;i<=2*n-1;i++){
            System.out.print(i + " ");
        }
        System.out.println();
        n--;
        int nsp=1;
        for(int i=1;i<=n;i++){ 
            int a = 1; //rows
            for(int j=1;j<=n+1-i;j++){  //star
                System.out.print(a++ + " ");
            }
            for(int j=1;j<=2*i-1;j++){   //spaces
                System.out.print(" " + " ");
                a++;
            }
            nsp += 2;
            for(int j=5;j<=n+5-i;j++){   //star
                System.out.print(a++ + " ");
            }
            System.out.println();
        } 
    }
}
