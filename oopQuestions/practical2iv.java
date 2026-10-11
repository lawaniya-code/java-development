import java.util.Scanner;
class Point{
    Scanner sc=new Scanner(System.in);
     int x;
     int y;

Point(){
    x=5;
    y=5;
}
Point(int x,int y){
    this.x=x;
    this.y=y;

}
void getvalues(){
    System.out.println("Enter the x-coordinate: ");
    x=sc.nextInt();
    System.out.println("Enter the y-coordinate: ");
    y=sc.nextInt();
    

}
}

public class practical2iv {
    public static void main(String[] args) {
        Point p1=new Point();
        p1.getvalues();
        Point p1=new Point()
    }
}
