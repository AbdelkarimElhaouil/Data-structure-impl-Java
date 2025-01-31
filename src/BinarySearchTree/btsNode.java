package BinarySearchTree;

public class btsNode {
    private int data;
    private btsNode right, left;

    //Constructors
    public btsNode(){
        this(0);
    }

    public btsNode(int d){
        this(d, null, null);
    }

    public btsNode(int d, btsNode l, btsNode r){
        data = d;
        left = l;
        right = r;
    }

    //Getters
    public btsNode getLeft() {return left;}

    public btsNode getRight() {return right;}

    public int getData() {return data;}

    //Setters

    public void setData(int data) {this.data = data;}

    public void setLeft(btsNode left) {this.left = left;}

    public void setRight(btsNode right) {this.right = right;}
}
