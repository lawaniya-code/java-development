import java.util.Scanner;
import java.util.Arrays;
public class wavearray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
       
        Arrays.sort(arr);
        System.out.println("The array formed is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
       for(int i=0;i<n-1;i+=2){
        reverse(arr,i,i+1);
       }

        
        System.out.println();
         System.out.println("The wave array formed is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");}
            sc.close();
        }


    
    public static void reverse(int[]arr,int i,int j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
