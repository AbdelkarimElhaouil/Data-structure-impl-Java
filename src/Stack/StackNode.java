package Stack;

public class StackNode<T> {
    private T data;
    private StackNode<T> next;

    //Constructors
    public StackNode(){
        this(null, null);
    }
    public StackNode(T d){
        this(d, null);
    }
    public StackNode(T d, StackNode<T> n){
        this.data = d;
        this.next = n;
    }
    //accessors
    public T getData(){
        return this.data;
    }
    public StackNode<T> getNext(){
        return this.next;
    }
    //Setters
    public void setData(T d){
        this.data = d;
    }
    public void setNext(StackNode<T> n){
        this.next = n;
    }
}
