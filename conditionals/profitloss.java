import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a,b;
        System.out.print("Enter the costprice");
        a=sc.nextInt();
        System.out.print("Enter the saleprice ");
        b=sc.nextInt();
        if(a>b){
            System.out.println("LOSS!");
            System.out.println(a-b);

        }
        else{
            System.out.println("PROFIT!");
            System.out.println(b-a);
        }
       






    }
}
