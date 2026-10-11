import java.util.Scanner;
public class volumeofsphereusinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int radii;
       System.out.print("Enter the radii of the ");
       radii=sc.nextInt();
       double pi=3.145;
       double volume=((4*pi*radii*radii*radii))/3;
       System.out.println("The volume of the sphere is "+volume);
        
    }
}
