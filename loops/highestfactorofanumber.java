import java.util.Scanner;
public class highestfactorofanumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        int hf=1;
        int i;
        System.out.println("Enter a number");
        n=sc.nextInt();
        // for(i=1;i<n;i++){
           
            
        //      if(n%i==0)
        //         hf=i;
            
        
        // }
        //  System.out.println("The highest factor of"+n+"is"+hf);
        for( i=n-1;i>=1;i--){
            if(n%i==0){
                hf=i;
                break;

            }
           
        }
        System.out.println(hf);
       
    }
}
