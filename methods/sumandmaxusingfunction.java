

public class sumandmaxusingfunction {
    public static void Max(int a,int b,int c){//parameters
        System.out.println(Math.max(Math.max(a,b),c));
    }
    public static void Sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Max(7,8,6);//arguments
        System.out.println("Thankyou!");
        Sum(3,4,5);
        
        
    }
    
}
