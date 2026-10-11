import java.util.Scanner;

public class productofthearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the elements of teh array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("The array formed is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int p=1;
        for(int i=0;i<n;i++){
            p=p*arr[i];
        }
        System.out.println();
        System.out.print("The product of the elements of the array is "+p);
    }
}
