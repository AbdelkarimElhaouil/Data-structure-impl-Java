package LinkedList;

public class double_LinkedList {
        private double_LLnode head;
        private int size = 0;

        public double_LinkedList()
        {
            head = null;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public void addFront(String n){
            if(isEmpty()) {
                double_LLnode newNode = new double_LLnode(n);
                head = newNode;
                size++;
            }
            else {
                double_LLnode newNode = new double_LLnode(n);
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
                size++;
            }
        }
        public void addBack(String n){
            if(isEmpty()){
                addFront(n);
            }
            else{
                double_LLnode newNode = new double_LLnode(n);
                double_LLnode helpPtr = head;
                while(helpPtr.next != null){
                    helpPtr = helpPtr.next;
                }
                helpPtr.next = newNode;
                newNode.prev = helpPtr;
                size++;
            }
        }
        public void addIn(String n, int ind)
        {
            if (ind == 0){
                addFront(n);
            }
            else {
                double_LLnode newNode = new double_LLnode(n);
                double_LLnode helpPtr = head;
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
            double_LLnode helpPtr = head;
            while(helpPtr != null){
                System.out.println(helpPtr.name);
                helpPtr = helpPtr.next;
            }
        }
    }

