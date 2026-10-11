import java.util.Scanner;
public class Segregate0sand1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        
        int[]arr=new int[n];
        System.out.println("Enter only O's & 1's else default value will be 0 in place of wrong entered ");
       for(int i=0;i<n;i++){
        int x =sc.nextInt();
        if(x==0||x==1){
            arr[i]=x;
        }
       
       }
       
        System.out.print("The array formed is  ");
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
        //two pass solution as we are traversing array two times .
       int m=0;
       int p=0;
       for(int i=0;i<n;i++){
        if(arr[i]==0){
            m=m+1;
        }
        if(arr[i]==1){
            p=p+1;
        }
       }
       System.out.println("Number of zeroes in array "+m);
       System.out.println("Number of ones in array is "+p);
       for(int i=0;i<m;i++){
        arr[i]=0;
       }
       for(int i=m;i<n;i++){
        arr[i]=1;
       }
       System.out.print("The new array formed is ");
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }




    }
}
