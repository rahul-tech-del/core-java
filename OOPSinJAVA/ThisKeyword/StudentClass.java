package OOPSinJAVA.ThisKeyword;

public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        // s1.rno = 76;
        s1.percent = 92.8;

        s1.setRno(96);  //store the rollnumber 
        System.out.println(s1.getRno()); //print the update rollnumber  
        
    }
    
}
