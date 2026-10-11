import java.util.Scanner;

public class maxof3usingbuiltin {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a,b,c,d;
     System.out.println("Enter the 1st number");
     a=sc.nextInt();
     System.out.println("Enter the 2nd number");
     b=sc.nextInt();
     System.out.println("Enter the 3rd number");
     c=sc.nextInt();
     System.out.println("Enter the 4th number");
     d=sc.nextInt();
     System.out.println(Math.max(Math.max(a,b),(Math.max(c,d))));
     
     


   }

    
}
