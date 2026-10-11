import java.util.Scanner;

public class missingelementinarray {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the array : ");
         System.out.println("Enter the number ranged from 1"+"to "+(n+1));
        for(int i=0;i<n;i++){
            int input;
            
            do{
               
                input=sc.nextInt();
                if(input<1||input>n+1 ){
                    System.out.println("Enter the valid input !");
                }}
                while(input<1||input>n+1);{
                    arr[i]=input;
                }
            
        }
          System.out.println();
        System.out.print("The array formed is : ");
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int sum =0;
        int arraysum=0;
        for(int i=0;i<=n+1;i++){
            sum=sum+i;
        }
        for(int i=0;i<n;i++){
            arraysum=arraysum+arr[i];
        }
        int f = sum-arraysum;
        System.out.println("The missing element is "+f);
    
      


    }
}
