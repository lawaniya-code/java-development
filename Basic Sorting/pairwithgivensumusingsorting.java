import java.util.Scanner;
import java.util.Arrays;
public class pairwithgivensumusingsorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt(); 
        }
        System.out.print("The array formed is : ");
         System.out.println("[");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");}
            System.out.println("]");
            System.out.print("Enter the target element : ");
            int x=sc.nextInt();
            Arrays.sort(arr);
            int i=0;
            int j=arr.length-1;
            boolean found=false;
            while(i<j){
                if(arr[i]+arr[j]==x){
                    System.out.print("pair founded"+"("+arr[i]+","+arr[j]+")");
                    found=true;
                    break;
            
                }
                else if(arr[i]+arr[j]>x) j--;
                else if (arr[i]+arr[j]<x) i++;
                else{System.out.println("pair doesnt exists! ");}
            }
            if(found==false){
                System.out.println("pair doesn't exist! ");
            }
            

            
    }
}
