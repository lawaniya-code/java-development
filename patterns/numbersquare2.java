import java.util.Scanner;
public class numbersquare2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.print("Enter number of rows :");
        m=sc.nextInt();
        System.out.print("Enter number of coloumns :");
        n=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    
}
