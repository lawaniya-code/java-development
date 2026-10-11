import java.util.Scanner;

public class gradecalculation {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int a;
        System.out.print("Enter the percentage ");
        a= sc.nextInt();
       if(a>90){
        System.out.println("A");
       }
        else if(a>80){
        System.out.println("B");
       }
       else if(a>70){
        System.out.println("C");
       }
       else if(a>60){
        System.out.println("D");
       }
       else if(a>50){
        System.out.println("E");
       }
       else{
        System.out.println("FAIL!");
       }

    }
}
