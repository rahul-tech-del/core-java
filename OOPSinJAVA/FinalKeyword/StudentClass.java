package OOPSinJAVA.FinalKeyword;

public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student( "rahul", 47,  92.8);

        // s1.schoolName= "BBD"; //final keyword use so not allowed another name 

        System.out.println(s1.schoolName);
    }
    
}
