package LinkedList;

public class double_LinkedList<T> {
        private double_LLnode<T> head;
        private int size = 0;

        public double_LinkedList()
        {
            head = null;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public void addFront(T n){
            if(isEmpty()) {
                head = new double_LLnode<>(n);
                size++;
            }
            else {
                double_LLnode<T> newNode = new double_LLnode<T>(n);
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
                size++;
            }
        }
        public void addBack(T data){
            if(isEmpty()){
                addFront(data);
            }
            else{
                double_LLnode<T> newNode = new double_LLnode<>(data);
                double_LLnode<T> helpPtr = head;
                while(helpPtr.next != null){
                    helpPtr = helpPtr.next;
                }
                helpPtr.next = newNode;
                newNode.prev = helpPtr;
                size++;
            }
        }
        public void addAt(T data, int ind)
        {
            if (ind == 0){
                addFront(data);
            }
            else {
                double_LLnode<T> newNode = new double_LLnode<>(data);
                double_LLnode<T> helpPtr = head;
                while(ind - 1 > 0){
                    helpPtr = helpPtr.next;
                    ind--;
                }
                newNode.next = helpPtr.next;
                newNode.prev = helpPtr;
                helpPtr.next.prev = newNode;
                helpPtr.next = newNode;
                size++;

            }
        }
        public void print(){
            double_LLnode<T> helpPtr = head;
            while(helpPtr != null){
                System.out.println(helpPtr.data);
                helpPtr = helpPtr.next;
            }
        }
    }

