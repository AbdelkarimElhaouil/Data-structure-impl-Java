package Stack;

public class StackLL<T>{
    private StackNode<T> top;
    public StackLL(){
        top = null;
    }
    public boolean isEmpty(){
        return top == null;
    }
    //Push function
    private StackNode<T> push(StackNode<T> top, T val){
        return top = new StackNode<>(val, top);
    }
    public void push(T val){
        top = push(top, val);
    }
    public void pop(){
        StackNode<T> tmp = top;
        top = pop(top);
    }
    // Pop function
    private StackNode<T> pop(StackNode<T> top){
        if(isEmpty()) {
            System.out.println("Error: Empty stack.");
            return null;
        }
        top = top.getNext();
        return top;
    }

    public void printAll(){
        if (isEmpty()){
            System.out.println("StackLL is Empty");
            return;
        }
        StackNode<T> helpPtr = top;
        while(helpPtr != null){
            System.out.println(helpPtr.getData());
            helpPtr = helpPtr.getNext();
        }
    }

    public StackNode<T> getTop(){
        return top;
    }

}
