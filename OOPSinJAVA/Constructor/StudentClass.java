package OOPSinJAVA.Constructor;

public class StudentClass {



    public static void change(Student s){
        s.name = "Raghav";
    }
    public static void main(String[] args) {
        Student s1 = new Student("Rahul",76,92.1);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
    }
    
}
