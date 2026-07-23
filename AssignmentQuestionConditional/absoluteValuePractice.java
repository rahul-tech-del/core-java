package AssignmentQuestionConditional;

import java.util.Scanner;

public class absoluteValuePractice {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value :");
            int n = sc.nextInt();

            if(n < 0)
                System.out.println(-n);
            else
                System.out.println(n);
        }
    }
    
}
