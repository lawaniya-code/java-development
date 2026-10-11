import java.util.Scanner;
public class insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the arraylength: ");
        int n=sc.nextInt();
        int[]arr= new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The array formed is : ");
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        
        }
        System.out.print("]");

        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        System.out.println();
        System.out.print("The sorted array formed : ");
        System.out.print("[");
        for(int ele :arr)System.out.print(ele+" ");
        System.out.print("]");
    }
}
//best case: sorted array O(n) while wala loop nahi chalega 
//average case :O(n2)
//best case :O(n2) array is sorted  in descending order
//auxilaary space :O(1)//as no extra space is required
 
/************************Stability*********
 * it is stable as bubble sort as the relative position of the duplicate elements
 * remains same in both bubble and insertion unlike selection sort which is unstable
 */


