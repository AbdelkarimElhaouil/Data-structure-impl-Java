//package BinarySearchTree;
//
//public class BST<T extends Comparable<T>>{
//    protected BtsNode<T> root;
//    //Constructor
//    public BST() {
//        root = null;
//    }
//
//    //Insertion
//    public void insert(T d){
//        root = insert(root, d);
//    }
//    private BtsNode<T> insert(BtsNode<T> p, T d){
//        if(p == null)
//            p = new BtsNode<>(d);
//        else {
//            if (p.data.compareTo(d) > 0)
//               p.left = insert(p.left, d);
//            else
//                p.right = insert(p.right, d);
//        }
//        return p;
//    }
//
//    //Print Even nodes
//    public void printEvenNodes(){
//        printEvenNodes(root);
//    }
//    private void printEvenNodes(BtsNode p){
//        if(p != null){
//            if (p.data % 2 == 0)
//                System.out.getAll(p.data + " ");
//            printEvenNodes(p.right);
//            printEvenNodes(p.left);
//        }
//    }
//
//    //Print Odd Nodes
//    public void printOddNodes(){
//        printOddNodes(root);
//    }
//    private void printOddNodes(BtsNode p){
//        if(p != null){
//            if (p.data % 2 != 0)
//                System.out.getAll(p.data + " ");
//            printOddNodes(p.right);
//            printOddNodes(p.left);
//        }
//    }
//
//    //Print Odd nodes in ascending order
//    public void printOddNodesAsc(){
//        printOddNodesAsc(root);
//    }
//    private void printOddNodesAsc(BtsNode p){
//        if(p != null){
//            printOddNodesAsc(p.left);
//            if(p.data % 2 != 0)
//                System.out.getAll(p.data + " ");
//            printOddNodesAsc(p.right);
//        }
//    }
//    //count nodes
//    public int countNodes(){
//        return countNodes(root);
//    }
//    private int countNodes(BtsNode p){
//        if(p == null)
//            return 0;
//        else
//            return 1 + countNodes(p.left) + countNodes(p.right);
//    }
//
//    //Count LeafNodes
//    public int countLeafNodes(){
//        return countLeafNodes(root);
//    }
//    private int countLeafNodes(BtsNode p){
//        if(p != null){
//            if(p.left == null && p.right == null)
//                return 1;
//            else
//                return countLeafNodes(p.left) + countLeafNodes(p.right);
//        }
//        else
//            return 0;
//    }
//
//    //Print bigger numbers than N
//    public void printBigger( int n){
//        printBigger(root, n);
//    }
//    private void printBigger(BtsNode p, int n){
//        if(p == null)
//            return;
//        else {
//            if(p.data > n){
//                System.out.println(p.data + " ");
//                printBigger(p.right, n);
//                printBigger(p.left, n);
//            }
//            else
//                printBigger(p.right, n);
//        }
//    }
//
//    //Calculate sum of data nodes
//    public int sumNodes(BtsNode p){
//        if (p == null)
//            return 0;
//        else return p.data + sumNodes(p.left) + sumNodes(p.right);
//    }
//
//    //searching in an arbitrary binary tree ( o(n) )
//    public boolean arbSearch(int d){
//        return arbSearch(root, d);
//    }
//    private boolean arbSearch(BtsNode p, int d){
//        if(p == null)
//            return false;
//        if(p.data == d)
//            return true;
//        return (arbSearch(p.left, d) || arbSearch(p.right, d));
//    }
//
//    //searching in a binary search tree ( o(log(n)) )
//    public boolean recSearch(int d){
//        return recSearch(root, d);
//    }
//    private boolean recSearch(BtsNode p, int d){
//        if(p == null)
//            return false;
//        if (p.data == d)
//            return true;
//        else {
//            if(p.data > d)
//                return recSearch(p.left, d);
//            else
//                return recSearch(p.right, d);
//        }
//    }
//    public boolean search(int d){
//        return search(root, d);
//    }
//    private boolean search(BtsNode p, int d){
//        while (p != null) {
//            if(p.data == d)
//                return true;
//            else {
//                if (p.data > d)
//                    p = p.left;
//                else
//                    p = p.right;
//            }
//        }
//        return false;
//    }
//    //compute the height of the tree
//    public int getHeight(){
//        return getHeight(root);
//    }
//    private int getHeight(BtsNode p){
//        int left, right;
//        if(p == null)
//            return 0;
//        left = getHeight(p.left);
//        right = getHeight(p.right);
//        if(left > right)
//            return left + 1;
//        return right + 1;
//    }
//
//    //Find Largest
//    public BtsNode findLargest(){
//        return findLargest(root);
//    }
//    private BtsNode findLargest(BtsNode p){
//        if(p == null)
//            return null;
//        if(p.right == null)
//            return p;
//        return findLargest(p.right);
//    }
//    //Count Nodes with one child
//    public int countSingleNodeChild(){
//        return countSingleNodeChild(root);
//    }
//    private int countSingleNodeChild(BtsNode p){
//        if(p == null)
//            return 0;
//        if((p.right == null && p.left != null) || (p.left == null && p.right != null))
//            return 1 + countSingleNodeChild(p.right) + countSingleNodeChild(p.left);
//        return countSingleNodeChild(p.right) + countSingleNodeChild(p.left);
//    }
//    // Traversal methods
//    public void preOrder(BtsNode p){
//        if(p != null){
//            System.out.getAll(p.data + " ");
//            preOrder(p.left);
//            preOrder(p.right);
//        }
//    }
//    public void inOrder(BtsNode p){
//        if(p != null){
//            inOrder(p.left);
//            System.out.getAll(p.data + " ");
//            inOrder(p.right);
//        }
//    }
//    public void postOrder(BtsNode p){
//        if(p != null){
//            preOrder(p.left);
//            preOrder(p.right);
//            System.out.getAll(p.data + " ");
//        }
//    }
//}
