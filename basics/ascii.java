package basics;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);
            int x = (int)ch;
            System.out.println(x);
        }

               //or int function is use ascii value:
        //System.out.println((int)ch);
    }
}
