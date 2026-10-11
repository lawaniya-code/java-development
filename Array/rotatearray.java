import java.util.Scanner;
public class rotatearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
          System.out.println();
        System.out.print("The array formed is : ");
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the number of rotations : ");
        int d=sc.nextInt();
        d=d%n;
        reverse (arr,0,d-1);
        reverse (arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println("The new array formed is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
    public static void reverse (int[]arr, int i,int j){
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
