import java.util.Scanner;

public class backwardprintingofnumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("ENter a number from which backward printing had to be done=");
        n=sc.nextInt();
        for(int i=n;i>0;i=i-1){
            System.out.println(i);
        }

    }
}
