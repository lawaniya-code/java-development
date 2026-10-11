class Cricketer{
    static String country="India";
    int runs;
    String name;
    double avg;
    static void greet(){
        System.out.println("I only believe in myself");
    }
}
public class staticvariable {
    public static void main(String[] args) {
        Cricketer c1= new Cricketer();
        Cricketer c2= new Cricketer();
        c1.country ="NZ";
        //STATIC Variable: jab bhi ham object banayenge tab instead of four boxes sirf 3 boxes will be made
        //jaha hamne static likha bale hi default value set na karen woh variable static hai matlab it will be
        // shared by everyone woh alag hi box exist karega isliye jab hamne c1 mein country NZ ki tab woh single
        //box mein hi change ho gayi or jab hamne print kiya c2 tab nz print hua .
        //STATIC==SHARED VARIABLE==SINGLE DABBA
        //FINAL keyword likhne se change nahi kar payenge lekin alag alag box banega uska object ke saath
        System.out.println(c2.country);
        Cricketer.greet();
    }
}
