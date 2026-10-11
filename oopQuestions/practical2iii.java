import java.util.Scanner;
class time{
    int hours;
    int minutes;
    void settime(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter hours : ");
        hours=sc.nextInt();
        if (hours<0){
            hours= hours*(-1);
        }
        System.out.print("Enter minutes: ");
        minutes=sc.nextInt();
        if(minutes<0){
            minutes=minutes*(-1);
        }

    }
     void displaytime(){
       
        System.out.println(hours+"H"+ minutes+"m");
        
    }
   static void addtime(time t1,time t2){
        int a;
        a= t1.hours + t2.hours;
        int b;
        b= t1.minutes + t2.minutes;
       
        System.out.println("Total time "+a+"Hrs"+b+"mins");

        
    }

    
}
public class practical2iii {
    public static void main(String[] args) {
        
        time t1=new time();
        t1.settime();
        t1.displaytime();
        
         time t2=new time();
        t2.settime();
        t2.displaytime();
        
       time.addtime(t1,t2);
       

    }
}
