import java.util.Scanner;

public class stdentmanager {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter class strength: ");
        int n=sc.nextInt();
        String[] names=new String[n];
        int[] marks=new int[n];
        int count=0;
        while(true){
            System.out.println("1. Add Student ");
            System.out.println("2. Display Students ");
            System.out.println("3. Show Highest marks");
            System.out.println("4. Show Average Marks ");
            System.out.println("5. Exit");
            int choice =sc.nextInt();
            System.out.println();
            switch(choice){
                case 1:
                sc.nextLine();//Clear buffer i.e space 
                System.out.println("Enter name ");
                names[count]=sc.nextLine();
                System.out.println("Enter the marks :");
                marks[count]=sc.nextInt();
                sc.nextLine();
                count++;
                System.out.println("Student added!");
                break;

                case 2:
                if(count==0){
                    System.out.println("No students available ");
                }
                else{
                    for(int i=0;i<count;i++){
                        System.out.println(names[i]+"-"+marks[i]);
                        
                    }

                }  
                break;
                case 3:
                if(count==0){
                    System.out.println("No data exists");
                }
                else{
                    int max=marks[0];
                    String topper=names[0];
                    for(int i=0;i<count;i++){
                        if(marks[i]>max){
                            max=marks[i];
                            topper=names[i];
                        }
                    }
                   System.out.println("toppers with marks "+ max);
                   for(int i=0;i<count;i++){
                    if(marks[i]==max){
                        System.out.println(names[i]);
                    }
                   }  
                    break;
                }
                case 4:
                if(count==0){
                    System.out.println("No data found");
                }
                else{
                    int sum=0;
                    for(int i=0;i<count;i++){
                        sum=sum+marks[i];
                    }
                    double avg=(double)sum/count;
                    System.out.println("Average Marks : "+avg);
                    break;
                    
                }
                case 5:
                    System.out.println("Exiting.....");
                    return;
                    default:
                        System.out.println("Invalid input!");




            }

        }
    }
}
