import java.util.Scanner;
import java.util.Arrays;
public class unionoftwoarray {
    public static void print(int[]arr){
         System.out.print("[");
    for(int i=0;i<arr.length;i++){
       
        System.out.print(arr[i]+" ");
        
    }
    System.out.print("]");
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the arraylength of 1st array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print(arr);
        System.out.println();

        System.out.print("Enter the arraylength of 2nd array: ");
        int m=sc.nextInt();
        int []arr2=new int[m];
        System.out.print("Enter the elements of the array : ");
        for(int k=0;k<m;k++){
            arr2[k]=sc.nextInt();
        }
        print(arr2);
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println();
        System.out.println("Both sorted arrays are given as: ");
        System.out.print(" arr1: ");
        print(arr);
        System.out.print(" arr2: ");
        print(arr2);
        int i=0,j=0,count=0;
        int[]union=new int[m+n];
        while(i<n && j<m){
            if(arr[i]==arr2[j]){
                union[count]=arr[i];
                count++;
                i++;
                j++;
            }
            else if(arr[i]<arr2[j]){
                union[count]=arr[i];
                i++;
                count++;

            }
            else {
                union[count]=arr2[j];
                j++;
                count++;
            }
        }
        while(i<n){
            union[count]=arr[i];
            i++;
            count++;

        }
        while(j<m){
            union[count]=arr2[j];
            j++;
            count++;
        }
        
        System.out.println();
        System.out.println("The union of the arrays is : ");
        System.out.print("[");
        for(int k=0;k<count;k++){
            
            System.out.print(union[k]+" ");
        }
        System.out.print("]");
    }}
