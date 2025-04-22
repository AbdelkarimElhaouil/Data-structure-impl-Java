package BinarySearchTree;

public class BtsNode<T>{
    protected T data;
    protected BtsNode right, left;

    //Constructors
    public BtsNode(){
        right = left = null;
    }
    public BtsNode(T d){
        this(d, null, null);
    }
    public BtsNode(T d, BtsNode l, BtsNode r){
        data = d;
        left = l;
        right = r;
    }
}
