package OOPSinJAVA.StaticKeyword;

public class StudentClass {
    public static void change(Student s){
        s.name = "Roshan";

    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul",76, 98.6);
        System.out.println(Student.numberOfStudents);
        Student s2 = new Student("Raghav", 47, 94.8);
        System.out.println(Student.numberOfStudents);
        Student s3 = new Student("Sagar", 48,92.5);
        System.out.println(Student.numberOfStudents);
    }
    
}
