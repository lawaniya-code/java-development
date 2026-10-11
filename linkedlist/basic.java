class Node{
       int data;
       Node next;
       Node(int data){
        this.data=data;
        this.next=null;
       }

}
public class basic{
    public static void main(String[] args) {
        int[]arr={2,3,45,67};
        Node n1=new Node(arr[0]);
        Node n2=new Node(arr[1]);
        n1.next=n2;
        System.out.println(n2.data);
    }
}