//package BinarySearchTree;
//
//public class bstlab {
//    private btsNode root;
//    public bstlab(){
//        root = null;
//    }
//
//    public boolean isEmpty(){return root == null;}
//
//    //Search
//    public boolean search(int d){
//        return search(root, d);
//    }
//    private boolean search(btsNode p, int d){
//        while (p != null) {
//            if(p.getData() == d)
//                return true;
//            else {
//                if (p.getData() > d)
//                    p = p.getLeft();
//                else
//                    p = p.getRight();
//            }
//        }
//        return false;
//    }
//    public btsNode find(int d){
//        return find(root, d);
//    }
//    private btsNode find(btsNode p, int d){
//        while (p != null) {
//            if(p.getData() == d)
//                return p;
//            else {
//                if (p.getData() > d)
//                    p = p.getLeft();
//                else
//                    p = p.getRight();
//            }
//        }
//        return null;
//    }
//
//
//    //Insertion
//    public void insert(int d){
//        root = insert(root, d);
//    }
//    private btsNode insert(btsNode p, int d){
//        if(p == null)
//            return new btsNode(d);
//        else{
//            if(p.getData() > d) {
//                p.setLeft(insert(p.getLeft(), d));
//            }
//            else {
//                p.setRight(insert(p.getRight(), d));
//            }
//        }
//        return p;
//    }
//
//    //check node if it has only one child and determinate its place
//    public int one(int d) {
//        return one(root, d);
//    }
//    private int one(btsNode p, int d){
//        if(p == null || isLeaf(d))
//            return 0;
//        if(p.getData() == d){
//            if(p.getRight() == null && p.getLeft() != null)
//                return 1; // 1 if it placed on the right of its root
//            else if (p.getRight() != null && p.getLeft() == null)
//                return 2; // 2 if it placed on the left of its root
//            else
//                return 0;
//        }
//        if(p.getData() > d)
//            return one(p.getLeft(), d);
//        else
//            return one(p.getRight(), d);
//    }
//
//    //Delete a Node
//    public void deleteNode(int d){
//        root = deleteNode(root, d);
//    }
//    private btsNode deleteNode(btsNode p, int d){
//        if(!search(d) || isLeaf(p.getData()))
//            return null;
//        else if(isLeaf(d)){ // if the node is a leaf
//            if(parent(d).getData() < d) {
//                parent(d).setRight(null);
//            }
//            else {
//                parent(d).setLeft(null);
//            }
//            return p;
//        }
//        // if it has one child
//        else if (one(d) != 0) { //1->left, 2->right
//            if(leftOrRight(d) == 1) { // the node we want to delete is root's right
//                if (parent(d).getData() > d) //check if the node's only child is in right or left
//                    parent(d).setLeft(parent(d).getLeft().getLeft());
//                else parent(d).setLeft(parent(d).getLeft().getRight());
//            }
//            else {
//                if (leftOrRight(d) == 2) { // the node we want to delete is root's left
//                    if (parent(d).getData() > d) //check if the node's only child is in right or left
//                        parent(d).setRight(parent(d).getRight().getLeft());
//                    else parent(d).setRight(parent(d).getRight().getRight());
//                }
//            }
//            return p;
//        }
//        // if we reached this statement that's mean that node has two children
//        // Remember we have two choices
//        // 1) Is to find the minimum in the right subtree
//        // 2) Is to find the maximum in the left subtree
//        else {
//            int minNode = min(parent(d).getRight()).getData();
//            deleteNode(minNode);
//            if (parent(d).getData() > d)
//                parent(d).getLeft().setData(minNode);
//            else
//                parent(d).getRight().setData(minNode);
//            return p;
//        }
//
//    }
//
//    //Find Max
//    public btsNode max(){
//        return max(root);
//    }
//    private btsNode max(btsNode p){
//        if(p.getRight() != null)
//            return max(p.getRight());
//        return p;
//    }
//
//    //Find Min
//    public btsNode min(){
//        return min(root);
//    }
//    private btsNode min(btsNode p){
//        if(p.getLeft() == null)
//            return p;
//        return min(p.getLeft());
//    }
//
//    //Determine the place of the node if its left or right
//    public int leftOrRight(int d){
//        return leftOrRight(root, d);
//    }
//    private int leftOrRight(btsNode p, int d){
//        if(!search(d))
//            return 0;
//        if(p.getRight() != null && p.getRight().getData() == d)
//            return 2;
//        if(p.getLeft() != null && p.getLeft().getData() == d )
//            return 1;
//        else {
//            if(p.getData() > d)
//                return leftOrRight(p.getLeft(), d);
//            else return leftOrRight(p.getRight(), d);
//        }
//    }
//
//    //Determinate The parent
//    public btsNode parent(int d){
//        return parent(root, d);
//    }
//    private btsNode parent(btsNode p, int d){
//        if (p == null || !search(d))
//            return null;
//        if (p.getRight() != null && p.getRight().getData() == d) {
//            return p;
//        }
//        if (p.getLeft() != null && p.getLeft().getData() == d) {
//            return p;
//        }
//        else if (p.getLeft().getData() == d || p.getRight().getData() == d)
//                return p;
//
//        if(p.getData() > d)
//            return parent(p.getLeft(), d);
//        else
//            return parent(p.getRight(), d);
//    }
//
//    //calculate the height
//    public int height(){
//        return height(root);
//    }
//    private int height(btsNode p){
//        int lh = 0,rh = 0;
//        if(p == null)
//            return -1;
//        lh = height(p.getLeft());
//        rh = height(p.getRight());
//        if(lh > rh) return lh + 1;
//        else return rh + 1;
//    }
//
//    //Check if the Node is a Leaf
//    public boolean isLeaf(int d){
//        return isLeaf(root, d);
//    }
//    private boolean isLeaf(btsNode p, int d){
//        if(p == null)
//            return false;
//        else if (p.getData() == d){
//            if(p.getLeft() == null && p.getRight() == null)
//                return true;
//    }
//        return isLeaf(p.getRight(), d) || isLeaf(p.getLeft(), d);
//    }
//
//    //Print all nodes by descending
//    public void printNodesDes(){
//        printNodesDes(root);
//    }
//    private void printNodesDes(btsNode p){
//        if(p != null){
//            printNodesDes(p.getRight());
//            System.out.getAll(p.getData() + " ");
//            printNodesDes(p.getLeft());
//        }
//    }
//
//    //Print all Nodes by ascending
//    public void printNodesAsc(){
//        printNodesAsc(root);
//    }
//    private void printNodesAsc(btsNode p){
//        if(p != null){
//            printNodesAsc(p.getLeft());
//            System.out.getAll(p.getData() + " ");
//            printNodesAsc(p.getRight());
//        }
//    }
//
//    // Add a value to all nodes
//    public void addValueToAll(int d){
//         addValueToAll(root, d);
//    }
//    private void addValueToAll(btsNode p, int d){
//        if(p != null){
//            p.setData(p.getData() + d);
//            addValueToAll(p.getLeft(), d);
//            addValueToAll(p.getRight(), d);
//        }
//    }
//
//    // Print number of inner nodes
//    public int innerNodes(){
//        return innerNodes(root);
//    }
//    private int innerNodes(btsNode p){
//        if(isLeaf(p.getData()))
//            return 0;
//        else
//            return 1 + innerNodes(p.getRight()) + innerNodes(p.getLeft());
//    }
//
//    // Ex1: count nodes that are divisible by ?
//    public int countDivBy(int d){
//        return this.countDivBy(root, d);
//    }
//    private int countDivBy(btsNode p, int d){
//        if(p == null)
//            return 0;
//        if(p.getData() % d == 0)
//            return 1 + this.countDivBy(p.getLeft(), d) + this.countDivBy(p.getRight(), d);
//        return this.countDivBy(p.getLeft(), d) + this.countDivBy(p.getRight(), d);
//    }
//
//    // Print Nodes divisible by ?
//    public void printDivBy(int d){
//         printDivBy(root, d);
//    }
//    private void printDivBy(btsNode p, int d){
//        if(p != null){
//            System.out.println(p.getData() + ", ");
//            printDivBy(p.getLeft(), d);
//            printDivBy(p.getRight(), d);
//        }
//    }
//
//    // Ex2: Return sum of children of some BST node
//    public int sumOfChildren(){ // This method for count sum of root's children
//        return sumChildren(root);
//    }
//    public int sumOfChildren(btsNode p){ // this for count sum of a specific node's children
//        return sumChildren(p);
//    }
//    private int sumChildren(btsNode p){
//        int ls = 0, rs = 0;
//        if(p == null || isLeaf(p.getData()))
//            return 0;
//        else{
//            if(p.getLeft() != null)
//                ls = p.getLeft().getData() + sumOfChildren(p.getLeft());
//            if(p.getRight() != null)
//                rs = p.getRight().getData() + sumOfChildren(p.getRight());
//        }
//        return rs + ls;
//    }
//
//    // Ex: Check the tree if it's a full binary tree
//    public boolean isFullBST(){
//        return isFullBST(root);
//    }
//    private boolean isFullBST(btsNode p){
//        if(p == null)
//            return true;
//        if(one(p.getData()) != 0)
//            return false;
//        return isFullBST(p.getRight()) && isFullBST(p.getLeft());
//    }
//}
