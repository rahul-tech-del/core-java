package basics;

public class incrementDecrementAndModulus {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Original Value :" +x);
        //after increment
        int y = ++x;
        System.out.println("After Increment :" +y);
        //after decrement 
        int a = --y;
        System.out.println("After Decrement :" +a);
        //And modulus
        int b = a%3;
        System.out.println("Remainder :" +b);
    }
    
}
