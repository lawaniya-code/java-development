import java.util.Scanner;
public class findingkthsmallestelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the arraylength : ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the array elements[distinct]: ");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.print("The array formed is ");
        
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
       
        System.out.print("]");
        System.out.println();
        System.out.print("Enter the value of k (k < array length): ");
        int k=sc.nextInt();
   
    for(int i=0;i<=k;i++){
        int min=arr[i];
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[i]){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
        }

        
    }
    System.out.println("the kth smallest element "+arr[k-1]);


  
   
}}
