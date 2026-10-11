class Cartoon {
        private int power;
        String type;
        String name;
        Cartoon(String t,int p){//setter
            power=p;
            type=t;
        }
        void print(){//getter
            System.out.println(power+" "+type);
        }
    }
public class revisionloops {
    
    

    
    public static void main(String[] args) {
      Cartoon c1=new Cartoon("electric", 70);
      c1.print();

    }
}

