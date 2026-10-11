class ComplexNumber{
    int x;
    int y;
    ComplexNumber(int rno,int imgno){
        x=rno;
        y=imgno;

    }
    void print(){
       if(y>=0)  System.out.println("The complex number formed is "+x +" + i"+y);
       else if(y<=0) System.out.println("The complex number formed is "+x +"- i"+y);
       else System.out.println("The complex number formed is " + x);
    
    }


}
public class Complexno {
    public static void main(String[] args) {
        ComplexNumber c1=new ComplexNumber(3, 4);
        ComplexNumber c2= new ComplexNumber(5, 6);
        c1.print();
        c2.print();
    }
}
