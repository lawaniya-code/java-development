import java.util.Scanner;
public class basics{
    public static class student{
        String name;
        int rollno;
        double cgpa;
        void print(){
            System.out.println(name+" "+rollno+" "+cgpa);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        student s1=new student();
        s1.name="Lawaniya";
        s1.rollno=sc.nextInt();
        s1.cgpa=8.3;
        System.out.println(s1.name);
        s1.name="Himanshi";
        change(s1);
        s1.print();
        
    }
    private static void change(student x){
        x.name="lavi";
    }
}

