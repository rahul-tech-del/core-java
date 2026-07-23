package Loops;
import java.util.Scanner;
public class tableOf11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number:");
            int n = sc.nextInt();
            for(int i=n; i<=10*n; i++){
                if(i%n == 0)
                System.out.println(i);
            }
        }

        
    
    }
    
}
