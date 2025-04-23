package Stack;

public class IntegerStack {
    private final int[] arr;
    private String[] str;
    private int top;
    private final int size;

    public IntegerStack(int s){
        size = s;
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public void push(int val){
        if(isFull())
            System.out.println("Error: StackLL is already full, cannot push "+val+".");
        else
            arr[++top] = val;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Error: cannot pop.");
            return 0;
        }
        return arr[top--];
    }

    public int top(){
        if(isEmpty()){
            System.out.println("Error: There is no top, empty stack.");
            return 0;
        }
        return arr[top];
    }
}
