package Conditionals;

import java.util.Scanner;

public class calculatorPointValue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float a = sc.nextInt();
            char op = sc.next().charAt(0);
            float b = sc.nextInt();
            switch (op){
                case '+' -> System.out.println(a+b);
                case '-' -> System.out.println(a-b);
                case '*' -> System.out.println(a*b);
                case '/' -> System.out.println(a/b);
            }
        } 

    }
    
}
