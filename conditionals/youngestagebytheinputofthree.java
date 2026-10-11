import java.util.Scanner;
public class youngestagebytheinputofthree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter age of ram=");
        a= sc.nextInt();
         System.out.print("Enter age of shyam=");
        b= sc.nextInt();
         System.out.print("Enter age of Ajay=");
        c= sc.nextInt();
        if(a<b){
            if(a<c){
                System.out.println("Ram is the youngest of all");
            }
            else{
                System.out.println("Ajay is the youngest of all");
            }
        }
        else if(a==b&&b==c){
            System.out.println("All are equal");
        }
        else  {
            if(b<c){
                System.out.println(" shyam is the youngest of all");
            }
            
            else{
                System.out.println("Ajay is the youngest of all");
            }
        }
        
    }
   
}
