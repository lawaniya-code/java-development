import java.util.Scanner;

public class absolutevalueofnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number ");
        int a;
        a=sc.nextInt();
        if(a<0){
            a=a*(-1);
            System.out.println("The absoulte of the number is "+a);
        }
        else{
            System.out.println("The absolute value of the number is "+a);
        }
    }
}
