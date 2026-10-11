import java.util.Scanner;
public class searchinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
       
        int[]arr=new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print("The array formed is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("enter an element: ");
        int x=sc.nextInt();
        // for(int i=0;i<n;i++){
        //     if(x==arr[i]){
        //         System.out.println("Element "+x+" found at index "+i);
        //         break;
        //     }
        //     else{System.out.println("Element not found!");}
            
        // }
        boolean flag =false;
        for(int i=0;i<n;i++){
            if(x==arr[i]) {
                flag=true;
                break;
            }

        }
        if(flag==true){
            System.out.println("Element found !");
        }
        else{System.out.println("Element not found");}
    }
}
