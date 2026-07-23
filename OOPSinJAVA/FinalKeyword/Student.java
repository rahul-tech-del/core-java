package OOPSinJAVA.FinalKeyword;

public class Student {
    String name;
    int rno;
    double percent;
    final String schoolName = "BBDU";   //final keyword use 

    public Student(){

    }
    public Student(String name, int rno, double percent ){
        this.name = name;
        this.rno = rno;
        this.percent = percent;
    }
    public int getRno(){
        return rno;
    }
    public void setRno(int rno){
        this.rno = rno;
    }
    
}
