import java.util.Scanner;
class Rectangle{
    double width=1;
    double height=1;
    Rectangle(){
    }
    Rectangle(int w,int h){
      width=w;
      height=h; 
    }
    void getarea(double x,double y){
        double area= x*y;
        System.out.println("The area of the rectangle is "+area);
    }
    void getperimeter(double x,double y){
        double perimeter=2*(x+y);
        System.out.println("The perimeter of the rectangle is "+perimeter);
    }
}

public class practical2i {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    double w=sc.nextDouble();
    System.out.println("Width of rectangle is "+w);
    double h=sc.nextDouble();
    System.out.println("Height of the rectangle is "+h);
    Rectangle r1=new Rectangle();
    r1.getarea(w,h);
    r1.getperimeter(w, h);
 }
    
}
