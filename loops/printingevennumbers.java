import java.util.Scanner;

public class printingevennumbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter upto which even numbers are to be printed =");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
            System.out.println(i);}
            
        }
        
    
}
}
