
 class Students{
        String name="lawaniya";
       private int rno=61;
        double cgpa;
       void print(){
            System.out.println(name+" "+rno+" "+cgpa);
        }
        int getrollno(){//getter
           return rno;
        }
        void setrollno(int x){
            rno=x;
        }
    }
public class privatekeyword {
   
    public static void main(String[] args) {
        Students s1=new Students();
        System.out.println(s1.name);
        System.out.println(s1.getrollno());
        s1.setrollno(65);
        System.out.println(s1.getrollno());
    }
    
}
