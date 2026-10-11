

public class passingarraytomethods {
    public static void main(String[] args) {
        int[] x={10,20,30,40};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);

    }
    public static void change(int[]y) {
        y[2]=99;//in java variable is passed by value hence no change can be made 
        //while array is passed by reference hence here y is pointing to the same elments 
        //which x is doing hence changes can be made
        
    }
}
