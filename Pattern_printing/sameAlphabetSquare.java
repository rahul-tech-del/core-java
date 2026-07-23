package Pattern_printing;

import java.util.Scanner;

public class sameAlphabetSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row :");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){  // rows
            for(int j=1;j<=n;j++){  // cols
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }     
    }
}
