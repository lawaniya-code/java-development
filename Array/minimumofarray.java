import java.util.Scanner;

public class minimumofarray {
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
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The minimum element of the array is "+ min);
}
}