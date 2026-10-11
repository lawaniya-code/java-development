

public class bubble_sort {
    public static void print(int[]arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int[]arr={3,4,7,-7,8,2};
        int n=arr.length;
        print(arr);
        // for(int i=0;i<n-1;i++){
        // for(int j=0;j<n-1;j++){
        //     if(arr[j]>arr[j+1]){
        //         int temp=arr[j];
        //         arr[j]=arr[j+1];
        //         arr[j+1]=temp;
        //     }
        // }}
        // print(arr);
        //optimized code :as after each pass the last element will get sorted
    //     for(int i=0;i<n-1;i++){
    //     for(int j=0;j<n-1-i;j++){
    //         if(arr[j]>arr[j+1]){
    //             int temp=arr[j];
    //             arr[j]=arr[j+1];
    //             arr[j+1]=temp;
    //         }
    //     }}
    //     print(arr);
    // }

    //thoda aur achaa optimised                //time complexity
                                               //best case:O(n) ,Worst /Average case:O(n2)
                                          
    for(int i=0;i<n-1;i++){
        int swaps=0;
        
        for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            swaps++;
        }

        }
    }
    if(swaps==0) break;
    print(arr);
    }}
