import java.util.Scanner;
public class hollowrectangle {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int m,n;
    System.out.print("Enter the number of rows");
    m=sc.nextInt(); 
    System.out.print("Enter the number of coloumns");
    n=sc.nextInt(); 
    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
      if(i==1||i==m||j==1||j==n){
        System.out.print("* ");
      }
      else System.out.print("  ");
      }
      System.out.println();
    }
    sc.close(); 
  } 
  
}
