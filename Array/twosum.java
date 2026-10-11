import java.util.Scanner;
public class twosum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size   ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array formed is ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Enter the target sum  : ");
        int target=sc.nextInt();
        boolean flag=false;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target ){
                   flag=true;
                  
                }
               
            }}
            if(flag==true){
                System.out.println("Elements founded!");
            }
            else{
                System.out.println("No elements found!");
            }
    }
    }

