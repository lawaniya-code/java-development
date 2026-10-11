public class methodoverloading {
    public static int max(int a,int b){
        return Math.max(a,b);
    }
    public static int max(int a,int b,int c){
        return Math.max(a,max(b,c));
    }
    //Method overloading 
    // same name ke do or more  method according to the no of arguments passed woh method chalta hai                                                                                                                                                                                        
    public static void main(String[] args) {
        System.out.println(max(3,5,7));
    }
}
