package Queue;

public class QueueArr {
    private int[] queue;
    private int itemsNo;
    private int front;
    public QueueArr(int s){
        queue = new int[s];
        itemsNo = 0;
        front = 0;
    }
    public int front(){
        return queue[front];
    }
    public int size(){
        return itemsNo;
    }
    public boolean isEmpty(){
        return itemsNo == 0;
    }
    public boolean isFull(){
        return itemsNo == queue.length;
    }
    public void enqueue(int val){
        if(isFull())
        {
            System.out.println("Cannot add: Full list.");
            return;
        }
        queue[(front+itemsNo)%queue.length] = val;
        itemsNo++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Error: Cannot dequeue, Empty queue.");
            return 0;
        }
        int val = queue[front];
        itemsNo--;
        front = (front + 1 )% queue.length;
        return val;
    }
    public void print(){
        if(itemsNo == 0) {
            System.out.println("Cannot display: Empty queue");
            return;
        }
        int f = front;
        for(int s = itemsNo; s > 0; s--){
            System.out.println(queue[f]);
            f = (f + 1) % queue.length;
        }
    }
}
