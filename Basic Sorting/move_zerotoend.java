import java.util.Scanner;


public class move_zerotoend {
    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the array length: ");
       int n=sc.nextInt();
       int[]arr=new int[n];
       System.out.print("Enter the elements of the array");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.print("The array formed is :");
       print(arr);
       for(int i=0;i<n-1;i++){
        boolean check=true;
        for(int j=0;j<n;j++){
            if(arr[j]==0){
                check=false;
                break;
            }
        }if(check==false){
        for(int j=0;j<n-1-i;j++){
            if(arr[j]==0){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }}
       }
       System.out.print("The new  array formed is ");
       print(arr);
    }
}
