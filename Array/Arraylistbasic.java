import java.util.ArrayList;
import java.util.Collections;
public class Arraylistbasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(25);
        arr.add(16);
        arr.add(18);
        arr.add(5);
        System.out.println(arr.get(2)); // arr[2]
        arr.set(3,88);// arr[3]=50
        System.out.println(arr);
        int n=arr.size();//arr.length
        // for(int i=0;i<n;i++){
        //     System.out.print(arr.get(i)+" ");

        // }
        // System.out.println();
        // for(int ele : arr){
        //     System.out.print(ele+" ");
        // }
        arr.add(2,100);
        System.out.print(arr);
        arr.remove(arr.size()-1);
        System.out.print(arr);
        // Collections.reverse(arr);
        // System.out.println(arr);
        int i=0,j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
        arr.set(arr.size()-1, arr.get(i));

    }
}
