package Queue;

public class QueueLL<T> {
    private QueueNode<T> front, back;
    private int size;
    QueueLL(){
        front = null;
        back = null;
        size = 0;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public QueueNode<T> getFront(){
        return front;
    }
    public int size(){
        return size;
    }
    public void enqueue(T d){
        enqueue(d, back);
    }
    private void enqueue(T d, QueueNode<T> b){
        if(isEmpty()){
            this.front = this.back = new QueueNode<>(d);
            size++;
            return;
        }
        b.setNext(new QueueNode<>(d));
        back = b.getNext();
        size++;
    }
    public QueueNode<T> dequeue(){
        return dequeue(front);
    }
    private QueueNode<T> dequeue(QueueNode<T> f){
        if(isEmpty()) {
            System.out.println("Error: Empty queue.");
            return null;
        }
        front = front.getNext();
        if(front == null)
            back = null;
        size--;
        f.setNext(null);
        return f;
    }
    public void printAll(){
        if(isEmpty())
            System.out.println("Empty List, nothing to display.");
        else {
            QueueNode<T> helpPtr = front;
            while (helpPtr != null) {
                System.out.println(helpPtr.getData());
                helpPtr = helpPtr.getNext();
            }
        }
    }

//    ***** Method was made for integers *****
//    public void smallestLargest(){
//        T min = front.getData();
//        T max = front.getData();
//        QueueNode hlpPtr = front.getNext();
//        while (hlpPtr != null){
//            if(max < hlpPtr.getData())
//                max = hlpPtr.getData();
//            if (hlpPtr.getData() < min)
//                min = hlpPtr.getData();
//            hlpPtr = hlpPtr.getNext();
//        }
//        System.out.println("The Largest node is: " + max);
//        System.out.println("The Smallest node is: " + min);
//    }
}
