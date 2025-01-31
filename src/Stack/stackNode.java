package Stack;

public class stackNode {
    private int data;
    private stackNode next;

    //Constructors
    public stackNode(){
        this(0, null);
    }
    public stackNode(int d){
        this(d, null);
    }
    public stackNode(int d, stackNode n){
        this.data = d;
        this.next = n;
    }
    //accessors
    public int getData(){
        return this.data;
    }
    public stackNode getNext(){
        return this.next;
    }
    //Setters
    public void setData(int d){
        this.data = d;
    }
    public void setNext(stackNode n){
        this.next = n;
    }
}
