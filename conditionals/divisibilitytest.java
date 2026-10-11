import java.util.Scanner;
public class divisibilitytest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.print("Enter a number");
        a= sc.nextInt();
        if(a%5==0 && a%3!=0){
            System.out.println("The number is divisible by 5 but not 3");
        }
        else if (a%5!=0 && a%3!=0){
            System.out.println("The number is not divisible by both 5 and 3");
        }
        else{
            System.out.println("the number is not divisible by 5 but it is by 3");
        }
    }
}
