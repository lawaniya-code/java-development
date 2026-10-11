import java.util.Scanner;

public class printingnegativenumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       
        System.out.println("Enter the array length");
        int n=sc.nextInt();
        
        int []arr=new int [n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
            System.out.print(arr[i]+" ");}
        }
    }
}
