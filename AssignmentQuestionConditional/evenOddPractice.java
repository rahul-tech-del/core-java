package AssignmentQuestionConditional;

import java.util.Scanner;

public class evenOddPractice {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number :");
            int n = sc.nextInt();

            if(n % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
    }
    
}
