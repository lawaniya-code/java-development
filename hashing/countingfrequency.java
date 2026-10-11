import java.util.Scanner;
import java.util.HashMap;

public class countingfrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int q=sc.nextInt();
        while(q>0){
            int number=sc.nextInt();
            System.out.println(map.getOrDefault(number,0));
            q--;
        }


    }
}
