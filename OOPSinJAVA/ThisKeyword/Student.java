package OOPSinJAVA.ThisKeyword;

public class Student {
    public String name; 
    private int rno;
    double percent;


    public int getRno(){  //this is a getter method         
        return rno;
    }

    public void setRno(int rno){  // this is a setter method   
        this.rno = rno;  //this is a thiKeyword method 
    }
}
