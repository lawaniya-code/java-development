import java.util.Scanner;
public class selectionsort{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       
        System.out.print("Enter Array length: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The array formed is: ");
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int mindex=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindex=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[mindex];
            arr[mindex]=temp;
           

        }
       System.out.print("Sorted array formed is:");
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
       

        
    }
} 


