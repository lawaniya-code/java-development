import java.util.Scanner;
public class alphabetsquare2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter number of rows:");
        m=sc.nextInt();
         System.out.println("Enter number of coloumns:");
        n=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }


        
    }
}
