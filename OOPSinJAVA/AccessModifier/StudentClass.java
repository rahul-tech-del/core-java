package OOPSinJAVA.AccessModifier;

public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        // s1.rno = 46; // rno is private, so it cannot be accessed directly in another class
        s1.percent = 70.8;
    }
}
