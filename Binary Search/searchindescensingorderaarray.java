import java.util.Scanner;
import java.util.Arrays;

public class searchindescensingorderaarray {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt(); 
        }
       
            System.out.print("Enter the target element : ");
            int x=sc.nextInt();
            Arrays.sort(arr);
             System.out.print("The array formed is : ");
         System.out.println("[");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");}
            System.out.println("]");
            int lo=0;
            int hi=n-1;
            boolean y=false;
            while(lo<=hi){
                int mid=(lo+hi)/2;
                if(arr[mid]==x) {
                 y=true;
                 System.out.println("element found at index"+mid);
                 break;

                }
                else if(arr[mid]>x) lo=mid+1;
                else{
                    hi=mid-1;
                }
            }
           
           if(y){
            System.out.println("element not found!");
           }
        
            }
        
    
}
