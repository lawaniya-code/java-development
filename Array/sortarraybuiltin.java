import java.util.Arrays;

public class sortarraybuiltin {
    public static void main(String[] args) {
        //sort= ascending order
        int[]a={3,4,5,1,7,8,8};
        print(a);
        Arrays.sort(a);
        print(a);
    }
    public static void print(int[]a){
        for(int i=0;i<7;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
