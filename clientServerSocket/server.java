import java.net.ServerSocket;
import java.net.Socket;
public class server{
public static void main(String args[]){
try{
    System.out.println("Waiting for client request");
    ServerSocket ss=new ServerSocket(9000);
    Socket soc =ss.accept();
    System.out.println("connection done");

}
catch(Exception e){
    e.printStackTrace();


}}
}






























































