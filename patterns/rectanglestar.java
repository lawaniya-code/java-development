import java.util.Scanner;

public class rectanglestar {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int k;
        System.out.println("Enter the number of rows:");
        k=sc.nextInt();
        //  int s;
        // System.out.println("Enter the number of columns:");
        // s=sc.nextInt();
        
        for(int i=1; i<=k; i++){//kitni lines hogi
           for(int j=1;j<=k;j++){
            System.out.print("* ");//ek line mein kitne stars honge
           }
           System.out.println();
        }
    }
}
