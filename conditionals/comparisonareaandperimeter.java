import java.util.Scanner;

public class comparisonareaandperimeter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r;
        double pi=3.145;
        System.out.println("Enter the value of radii=");
        r=sc.nextInt();
        double area= pi*r*r;
        double perimeter=2*pi*r;
        System.out.println("Area of the circle is"+area);
        System.out.println("Perimeter of the circle is "+perimeter);
        if(area>perimeter){
           
            System.out.println("Area is greater than perimeter");
        }
        else if(area==perimeter){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Perimeter is greater than area");
        }
    }
    
}
