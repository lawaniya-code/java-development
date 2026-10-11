public class needofthiskeyword {
    public static class Car{
        String name;
        int price;
        double average;
       
        Car(int price,String name ){
           price=price;// need of this keyword system samaj hi nahi paaya ye class wale price ki baat ho rahi hai 
                      //ya jo hamne constructor mein naam diya uski isliye usne constructor wali value hi change 
           name= name;//karke usime overwright kar di or hamne jo print karvaya woh method wala name or price tha
                     //hence in output it returned default value null and 0;
 
        }
        Car(String s,int x){
            name=s;
            price=x;

        }
        Car(String name,double average){
            this.name=name;
            this.average=average;//abhi sysytem samaj jayega yaha object or method mein jo name or avg hai uski baat ho rahi hai
        }
        void print(){
            System.out.println(price+" "+name);
        }

    }
       public static void main(String[] args) {
        Car c1= new Car(1225000,"BMW");
        c1.print();
        Car c2=new Car("Lamborghini", 122222000);
        c2.print();
       Car c3=new Car("audi", 85);
       c3.print();
       }
}
