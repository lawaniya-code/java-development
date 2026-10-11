import java.util.Arrays;

public class shallowcopydeepcopy {
    public static void main(String[] args) {
       int[]a={1,20,3,45};
       int[]arr=a;//shallow copy of a here its just another name of a 
       //hence both are refering to same if changes made in anyone of them will
       //reflect in another
       arr[0]=30;
       System.out.println(a[0]);
       int[]deep=Arrays.copyOf(a,arr.length);
       deep[0]=100;//here is the deepcopy so brandnew array is formed
       System.out.println(arr[0]);
       System.out.println(deep[3]);
       
    }
}
