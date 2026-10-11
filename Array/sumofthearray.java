import java.util.Scanner;


public class sumofthearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size :");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array formed is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int s=0;
        for(int i=0;i<n;i++){
            s=s+arr[i];
        }
        System.out.println("The Sum of the elements of the array is :"+s);
    }
}
