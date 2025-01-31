package BinarySearchTree;

public class intBTSNode {
    protected int data;
    protected intBTSNode right, left;

    //Constructors
    public intBTSNode(){
        right = left = null;
    }
    public intBTSNode(int d){
        this(d, null, null);
    }
    public intBTSNode(int d, intBTSNode l, intBTSNode r){
        data = d;
        left = l;
        right = r;
    }
}
