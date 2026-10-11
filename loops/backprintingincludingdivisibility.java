import java.util.Scanner;
public class backprintingincludingdivisibility {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter a number=");
    n=sc.nextInt();
    for( int i=100;i>0;i--){
        if(i%n==0){
            System.out.println(i);
        }
    }
    }
    
}
