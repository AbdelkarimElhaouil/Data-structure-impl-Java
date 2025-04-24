package BinarySearchTree;

public class BtsNode<T>{
    protected T data;
    protected BtsNode<T> right, left;

    //Constructors
    public BtsNode(){
        right = left = null;
    }
    public BtsNode(T d){
        this(d, null, null);
    }
    public BtsNode(T d, BtsNode<T> l, BtsNode<T> r){
        data = d;
        left = l;
        right = r;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BtsNode<T> getRight() {
        return right;
    }

    public void setRight(BtsNode<T> right) {
        this.right = right;
    }

    public BtsNode<T> getLeft() {
        return left;
    }

    public void setLeft(BtsNode<T> left) {
        this.left = left;
    }
}
