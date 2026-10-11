import java.util.Scanner;
public class GPprinting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,r,n;
        a=1;r=2;
        // System.out.print("Enter the first term = ");
        // a=sc.nextInt();
        // System.out.print("Enter the common difference = ");
        // r=sc.nextInt()

        
        System.out.print("Enter the number of terms upto which gp is to be printed = ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            a=a*2;


        }

       


    }
    
}
