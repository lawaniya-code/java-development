import java.util.Scanner;

public class divisibilitycheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("Enter a number");
        a=sc.nextInt();
        if(a%5==0){
            System.out.println(+a+"is divisible by 5");

        }
        else{
            System.out.println("The number entered is not divisible by 5 ");
        }


    }
}
