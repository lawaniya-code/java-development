import java.util.Scanner;

public class maximumofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array formed is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
         int m=arr[0];
        for(int i=0;i<n;i++){
           if(arr[i]>m){
            m=arr[i];
           }
            }
            System.out.println();
            System.out.println("The maximum element of the array is "+ m);
        }
    }
        


        
    

