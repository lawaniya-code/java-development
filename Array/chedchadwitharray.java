import java.util.Scanner;

public class chedchadwitharray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length = ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enetr the elemnets of the array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("The array formed is : ");
       
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
    
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=arr[i]+10;
            }
            else{
                arr[i]=arr[i]*2;
            }
        }
        System.out.println("The final array is : ");
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
        
    }
}
