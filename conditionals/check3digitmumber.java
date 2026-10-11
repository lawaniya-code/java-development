import java.util.Scanner;

public class check3digitmumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a=sc.nextInt();
        if(a>99 && a<1000){
            System.out.println("A three digit number");
        }
        else{
            System.out.println("Not a three digit number");
        }

    }
}
