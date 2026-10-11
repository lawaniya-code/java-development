import java.util.Scanner;
public class findingapairwithgivensum{
    public static void main(String[] args){
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
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]+arr[j]==x && arr[i]!=arr[j]){
                        System.out.print("The pair found having sum "+ x + " is " + "("+arr[i]+","+arr[j]+")");
                        System.out.println();

                    }
                   
                }
            }
           

    }
}
