import java.util.Scanner;
public class reversethearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int i=0; int j=n-1; 
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
           arr[j]=temp;
            i++;
            j--;
        }
        System.out.println();
        System.out.print("The reverse of the array is :");
        print(arr);
       


    }
    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++){ 
            System.out.print(arr[i]+" ");
        }

    }
    
}
