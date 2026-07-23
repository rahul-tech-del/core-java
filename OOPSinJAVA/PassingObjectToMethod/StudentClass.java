package OOPSinJAVA.PassingObjectToMethod;

public class StudentClass {
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

   
    public static void main(String[] args) {

        Student s1 = new Student();  // declaration
        s1.name =  "Rahul";
        s1.rno = 76;
        s1.percent = 96.2;

        fun(s1); 
    }
}
