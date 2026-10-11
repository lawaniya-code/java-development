import java.util.Scanner;
class Employee{
   
    private String name;
    private double salary;
    void reademployedata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of employee: ");
        name=sc.nextLine();
        System.out.println("Enter salary of employee: ");
         salary=sc.nextDouble();

    }
    void displayemployeedata(){
        System.out.println("Name ="+name );
        System.out.println("Salary ="+salary);  
    }

}
public class practical2ii{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Employee e1=new Employee();
        e1.reademployedata();
        e1.displayemployeedata();
    }
}