package Stack;

public class stackLL {
    private stackNode top;
    public stackLL(){
        top = null;
    }
    public boolean isEmpty(){
        return top == null;
    }
    //Push function
    private stackNode push(stackNode top, int val){
        return top = new stackNode(val, top);
    }
    public void push(int val){
        top = push(top, val);
    }
    public stackNode pop(){
        stackNode tmp = top;
        top = pop(top);
        return tmp;
    }
    // Pop function
    private stackNode pop(stackNode top){
        if(isEmpty()) {
            System.out.println("Error: Empty stack.");
            return null;
        }
        top = top.getNext();
        return top;
    }

    public stackNode getTop(){
        return top;
    }

}
