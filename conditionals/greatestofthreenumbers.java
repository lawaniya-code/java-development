import java.util.Scanner;
public class greatestofthreenumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 1st number=");
        a= sc.nextInt();
         System.out.print("Enter 2nd number=");
        b= sc.nextInt();
         System.out.print("Enter 3rd number=");
        c= sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(+a+"is the greatest of all");
            }
            else{
                System.out.println(+c+"is the greatest of all");
            }
        }
        else if(a==b&&b==c){
            System.out.println("All are equal");
        }
        else  {
            if(b>c){
                System.out.println(+b+"is the greatest of all");
            }
            
            else{
                System.out.println(+c+"is the greatest of all");
            }
        }
        
    }
   
}
