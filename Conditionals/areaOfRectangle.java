package Conditionals;
import java.util.Scanner;
public class areaOfRectangle {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the value of length :");
        int l = sc.nextInt();
        System.out.println("Enter the value of breadth :");
        int w = sc.nextInt();
        int a = w *l;
        System.out.println("Area of rectangle :" +a);
        int p = 2 *(l+w);
        System.out.println("Area of perimeter :" +p);
        if(a > p){
            System.out.println("Area of the rectangle is greater than perimeter");
        }
        if(a < p){
            System.out.println("Area of the rectangle is less than perimeter");
        }
        if(a == p)
        {
            System.out.println("Area of the rectangle is equal to perimeter");
        }
        sc.close();
    }
    }
    
    
}
