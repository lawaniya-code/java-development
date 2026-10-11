import java.util.Scanner;

public class printinghelloworlsbytakinginput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number");
        int a;
        a= sc.nextInt();
        for(int i=1;i<=a;i=i+1){
            System.out.println("Hello world");
        }
    }
}
