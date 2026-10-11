import java.util.Scanner;

public class printing1to10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter upto which numbers are to be printed =");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        
    }
}
