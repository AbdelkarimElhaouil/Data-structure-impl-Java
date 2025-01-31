package Queue;

public class queueNode {
    private int data;
    private queueNode next;
    public queueNode(){
        this(0, null);
    }
    public queueNode(int d){
        this(d, null);
    }
    public queueNode(int d, queueNode q){
        this.data = d;
        this.next = q;
    }
    //Getters/Accessors
    public int getData(){
        return data;
    }
    public queueNode getNext(){
        return next;
    }
    //Setters/Mutators
    public void setData(int d){
        this.data = d;
    }
    public void setNext(queueNode next) {
        this.next = next;
    }
}
