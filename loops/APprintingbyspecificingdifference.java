import java.util.Scanner;

public class APprintingbyspecificingdifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d;
        System.out.println("Enter the arithmetic difference=");
        d=sc.nextInt();
        System.out.println("The A.P is ");
        for(int i=1;i<10;i=i+d){
            System.out.println(i);
        }
    }
}
