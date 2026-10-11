import java.util.Scanner;
public class printingNtermsoftheAP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,n,d;
        System.out.print("Enter first term of an AP = ");
        a=sc.nextInt();

        System.out.print("Enter number upto which Ap is to be printed= ");
        n=sc.nextInt();
        System.out.print("Enter common  difference of the AP = ");
        d=sc.nextInt();
        int z = a+((n-1)*d);

        for(int i=a;i<=z;i=i+d){
            System.out.println(i);
        }
        // int a=3; d=4;
        // for(int i=1;i<=n;i++){    
        //     System.out.println(a+" ");
        //     a+=d;
        // }
        //comparative easier and independent of the value of i

    }
}
