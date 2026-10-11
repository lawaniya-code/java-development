import java.util.Scanner;
import java.util.Arrays;

public class formingnewarraywithcommonelemnts {
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
        int[]common=new int[Math.min(n,m)];
        int i=0;int j=0;
       int  count=0;
        System.out.println();
        System.out.print("The newly formed array is ");

        while(i<n && j<m){
            if(arr[i]==arr2[j]){
                common[count]=arr[i];
                i++;
                j++;
                count++;
            }
            else if(arr[i]<arr2[j]){
                i++;
            }
            else if(arr[i]>arr2[j]){
                j++;
            }
        }
        int[]result =new int[count];
        for(int k=0;k<count;k++){
            result[k]=common[k];
        }
        print(result);
        

        

    }
}
