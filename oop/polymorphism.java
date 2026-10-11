

public class polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");

        }

    }
    public static class cat{
        void speak(){
            System.out.println("Meow Meow");
        }

    }
    public static class lawaniya{
        void speak(){
            System.out.println("Helloooo");
        }

    }
    public static void main(String[] args) {
        lawaniya l=new lawaniya();
        Dog d=new Dog();
        cat c=new cat();
        l.speak();
        d.speak();
        c.speak();
    }
}
//ek naam alag alag kaam===polymorphism



