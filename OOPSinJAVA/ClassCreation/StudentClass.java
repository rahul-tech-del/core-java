public class StudentClass {
    // creating a new data type 
    public static class Student{
        String name;
        int rno; 
        double percent;
    }
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name =  "Rahul";
        s1.rno = 76;
        s1.percent = 96.2;
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);

        Student s2 = new Student();
        s2.name = "Raghav";
        s2.rno = 86;
        s2.percent = 92.3;
        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println(s2.percent);
    }
    
    
}
