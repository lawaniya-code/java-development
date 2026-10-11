import java.util.Scanner;
public class findingremainder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.print("Enter 1st number (a) = ");
        a=sc.nextInt();
        int b;
        System.out.print("Enter 2nd number (b) = ");
        b=sc.nextInt();
        int z=a%b;
        System.out.println("The remainder is "+z);
        //a%b==a%-b

    }
}
