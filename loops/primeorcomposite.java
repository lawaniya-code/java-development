import java.util.Scanner;
public class primeorcomposite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a positive number");
        n=sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
               System.out.println("It is a composite number");
               break;
            }
           
        }
        if(n==1){
            System.out.println("Neither prime nor composite");
        }
        else{
            System.out.println("The number is prime");
        }
    }
    
}//If i is a factor of n then n/i is also a factor
