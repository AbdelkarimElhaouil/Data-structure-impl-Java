package Queue;

public class QueueNode<T>{
    private T data;
    private QueueNode<T> next;
    public QueueNode(){
        this(null, null);
    }
    public QueueNode(T d){
        this(d, null);
    }
    public QueueNode(T d, QueueNode<T> q){
        this.data = d;
        this.next = q;
    }
    //Getters/Accessors
    public T getData(){
        return data;
    }
    public QueueNode<T> getNext(){
        return next;
    }
    //Setters/Mutators
    public void setData(T d){
        this.data = d;
    }
    public void setNext(QueueNode<T> next) {
        this.next = next;
    }
}
