package OOPSinJAVA.ClassInDiffirentFile;

public class StudentClass {
   
   
    public static void change(Student s){
        s.name = "Raghav";
    }
    public static void main(String[] args) {

        Student s1 = new Student();  // declaration
        s1.name =  "Rahul";
        s1.rno = 76;
        s1.percent = 96.2;
        System.out.println(s1.name);
        change(s1);
        System.out.println(s1.name);
    }
}
