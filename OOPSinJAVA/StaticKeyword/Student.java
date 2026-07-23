package OOPSinJAVA.StaticKeyword;

public class Student {
    String name;
    int rno;
    double percent;
    final String schoolName = "BBDU";
    static int numberOfStudents;


    public Student(){

    }

    public Student(String name ,int rno,double percent ){

        this.name = name;
        this.rno= rno;
        this.percent = percent;
        numberOfStudents++;
    }
    public int getRno(){
        return rno;
    }
    public void setRno(int rno){
         this.rno = rno;
    }
   
}
