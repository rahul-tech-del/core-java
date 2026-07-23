package OOPSinJAVA.Constructor;

public class Student {
    String name; 
    int rno;
    double percent;
    //This is a default constructor
    public Student(){

    }

public Student(String naam, int roll, double per){  //this is a contructor method use
    name = naam;
    rno = roll; 
    percent = per;
}

public int getRno(){  // getter 
    return rno;
}

public void setRno(int rno){   //setters
    this.rno = rno;
}
    
}
