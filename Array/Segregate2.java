import java.util.Scanner;
public class Segregate2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("Enter the elements(should be only 0's and1's) ");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
                if(x==0||x==1){
                    arr[i]=x;
                }
        }
        System.out.println();
        System.out.print("The array formed is :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        reverse(arr,0,n-1);
        System.out.print("The new array formed is :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        

    }
    public static void reverse(int[]arr,int i,int j){
        while(i<j){
           if(arr[i]==1 && arr[j]==0) {
            int temp=0;
            arr[i]= temp;
            arr[j]=arr[i];
            temp=arr[j];
            i++;
            j--;
            }
            else if(arr[i]==0 && arr[j]==0){
                i++;
            }
            else if(arr[i]==1 && arr[j]==1){
                j--;
            }
            
        }
    }
}