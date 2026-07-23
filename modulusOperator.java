package basics;

public class modulusOperator {
    public static void main(String[] args) {
        System.out.println(5 % 33);  //this case a%b=a (a<b)
        System.out.println(27 % -10);  //this case a%-b=a%b negative not include
        System.out.println(-27 % 10);  //this case -a%b=-[a%b] negative is include
    }
}
