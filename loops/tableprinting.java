import java.util.Scanner;

public class tableprinting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number whose table is to be printed ");
        n=sc.nextInt();
        int z= n*10;
        for(int i=n;i<=z;i=i+n){
            System.out.println(i);
        }
    }

}
