package OOPSinJAVA.PassingObjectToMethod;

public class ChangeObject {
    // creating a new data type 
    public static class Student{
        String name;
        int rno; 
        double percent;
    }

    public static void fun(Student x){
        System.out.println(x.name);
        return;
    }

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
