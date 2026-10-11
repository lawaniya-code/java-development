public class continuestatement {
   public static void main(String[] args) {
   
    for(int i=1;i<100;i++){
        if(i==18) continue;
        if(i%2==0 || i%3==0){
            System.out.println(i);
        }
    }
//continue mein niche ki cheeze iteration mein skip hoti hai 

   }

}
