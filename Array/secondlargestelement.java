import java.util.Scanner;
import java.util.Arrays;
public class secondlargestelement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter the array size ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print(arr);
        Arrays.sort(arr);
        System.out.println("The new array formed is : ");
        print(arr);
        System.out.println("The maximum element is " + arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[n-1]){
                System.out.println("the 2ndlargest element is "+ arr[i]);
                break;
            }
        }
      
    }
     public static void print(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}
