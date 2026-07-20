package Loops;

import java.util.Scanner;

public class APwithFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        // 4 7 10 13....
        int a=4, d=3;
        for(int i=1; i<=n; i++){
            System.out.println(a);
            a += d;
        }
    }
    
}
