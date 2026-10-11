class Cricketer{
    int runs;
    String name;
    double avg;
    final String country="India";//we cant the value of this 
}
public class finalandstatic{
    public static void main(String[] args) {
        Cricketer c1=new Cricketer();
        // c1.country="England";//we cant change ERROR/   
    }
}