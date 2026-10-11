import java.util.Scanner;
public class starplus {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter a odd  number");
        n=sc.nextInt();
        // int z=(n/2);
        int x=(n+1)/2; 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(i==x||j==x){
                System.out.print("* ");
               }
               else System.out.print("  ");
               
            }
            System.out.println();
           
        } 
        sc.close();
    }
    
}