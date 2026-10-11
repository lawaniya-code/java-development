public class constructor {
    public static class car{
        int seats;
        String name;
        double length;
        // constructor overloading 
        //ek hi naam ke multiple constructors
       car(){
//default constructor no return type.
       }
    car(int x , String s , double d){
        seats=x;//parameterize constructor when no parameterize constructor default comes into play
        name=s;
        length=d;
    }
    car(String s, int x,double d){
        seats=x;
        name=s;
        length=d;

    }
    void print(){
        System.out.println(seats +" "+name+" "+" "+length);
    }
    }
    public static void main(String[] args) {
        car c1= new car(7,"BMW",3.99);
        System.out.println(c1.name);
        c1.print();
        car c2 =new car("lawaniya",8,4.99);
        c2.print();
    }
}
