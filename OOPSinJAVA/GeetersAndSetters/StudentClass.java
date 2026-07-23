package OOPSinJAVA.GeetersAndSetters;

public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.percent = 92.8;
        
        //Setter: Used to set the value of rno
        s1.setRno(76);

       // Getter: Used to get (read) the value of rno 
        System.out.println(s1.getRno());
        System.out.println(s1.name);
        System.out.println(s1.percent);
    }
    
}
