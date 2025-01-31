package Queue;

public class queueLL {
    private queueNode front, back;
    private int size;
    queueLL(){
        front = null;
        back = null;
        size = 0;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public queueNode getFront(){
        return front;
    }
    public int size(){
        return size;
    }
    public void enqueue(int d){
        enqueue(d, back);
    }
    private void enqueue(int d, queueNode b){
        if(isEmpty()){
            this.front = this.back = new queueNode(d);
            size++;
            return;
        }
        b.setNext(new queueNode(d));
        back = b.getNext();
        size++;
    }
    public queueNode dequeue(){
        return dequeue(front);
    }
    private queueNode dequeue(queueNode f){
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
    public void print(){
        if(isEmpty())
            System.out.println("Empty List, nothing to display.");
        else {
            queueNode helpPtr = front;
            while (helpPtr != null) {
                System.out.println(helpPtr.getData());
                helpPtr = helpPtr.getNext();
            }
        }
    }
    public void smallestLargest(){
        int min = front.getData();
        int max = front.getData();
        queueNode hlpPtr = front.getNext();
        while (hlpPtr != null){
            if(max < hlpPtr.getData())
                max = hlpPtr.getData();
            if (hlpPtr.getData() < min)
                min = hlpPtr.getData();
            hlpPtr = hlpPtr.getNext();
        }
        System.out.println("The Largest node is: " + max);
        System.out.println("The Smallest node is: " + min);
    }
}
