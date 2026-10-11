import java.util.Scanner; 
public class selectionsortlargestfirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the arraylength: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         System.out.print("The array formed is :");
         System.out.print("[");
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

         }
         System.out.print("]");
         for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
           int  maxdex=-1;
           for(int j=i;j<n;j++){
            if(arr[j]>max){
                max=arr[j];
                maxdex=j;
            }
           }
           int temp=arr[i];
           arr[i]=arr[maxdex];
           arr[maxdex]=temp;
         }
         System.out.println();
         System.out.print("The sorted array formed is : ");
          System.out.print("[");
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

         }
         System.out.print("]");

    }
}
