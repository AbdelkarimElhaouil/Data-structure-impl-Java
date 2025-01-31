package BinarySearchTree;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
       bstSystem();
    }
    public static int menu(){
        System.out.println("|-----------------------------------------------|");
        System.out.println("|----------- Binary Search Tree Menu -----------|");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|  1) insert an item into the tree.             |");
        System.out.println("|  2) insert a set of elements into the tree.   |");
        System.out.println("|  3) Delete an item from the tree.             |");
        System.out.println("|  4) Print all nodes in ascending order.       |");
        System.out.println("|  5) Print all nodes in descending order.      |");
        System.out.println("|  6) Print number of inner nodes in the tree.  |");
        System.out.println("|  7) Print number of nodes dividable by ?.     |");
        System.out.println("|  8) Print sum of children of some nodes.      |");
        System.out.println("|  9) Determine if the tree is full Bst.        |");
        System.out.println("|  10) quit.                                    |");
        System.out.println("|-----------------------------------------------|");
        System.out.println();
        System.out.println(">>Please Enter Your Choice: ");
        Scanner inp = new Scanner(System.in);
        return inp.nextInt();
    }
    public static void bstSystem() {
        bstlab q = new bstlab();
        Scanner inp = new Scanner(System.in);
        int c;
        do {
            c = menu();
            if(c == 1){
                System.out.println("Please, Enter the item you want to add to the tree: ");
                int x = inp.nextInt();
                if(q.search(x))
                    System.out.println("item already exist, can't add duplicate items.");
                else {
                    q.insert(x);
                    System.out.println("Item "+ x +" Added successfully");
                }
            }
            else if (c == 2) {
                System.out.println("Enter how many elements do you want to insert: ");
                int x = inp.nextInt();
                for(int i = 0; i < x; i++){
                    System.out.println("Please, Enter the item no " + (i+1) + " you want to add to the tree: ");
                    int n = inp.nextInt();
                    if(q.search(n))
                        System.out.println("item already exist, can't add duplicate items.");
                    else {
                        q.insert(n);
                        System.out.println("Item " + n + " Added successfully");
                    }
                }
            }
            else if (c == 3) {
                System.out.println("Enter the item you want to delete from the tree: ");
                int x = inp.nextInt();
                if(!q.search(x))
                    System.out.println("Error: Cannot delete, item doesn't exist.");
                else {
                    q.deleteNode(x);
                    System.out.println("Item " +x+ " deleted successfully");
                }
            }
            else if (c == 4){
                if(q.isEmpty())
                    System.out.println("Error: Cannot display, Empty tree.");
                else {
                    System.out.println("Items on Ascending order: ");
                    q.printNodesAsc();
                    System.out.println();
                }
            }
            else if (c == 5){
                if(q.isEmpty())
                    System.out.println("Error: Cannot display, Empty tree.");
                else {
                    System.out.println("Items on descending order: ");
                    q.printNodesDes();
                    System.out.println();
                }
            }
            else if (c == 6){
                System.out.println("The number of inner nodes is: " + q.innerNodes());
            }
            else if (c == 7){
                System.out.println("Enter the number you want to divide by: ");
                int x = inp.nextInt();
                System.out.println("numbers that can divided by "+ x +" are: ");
                q.printDivBy(x);
            }
            else if (c == 8){
                System.out.println("Enter the item you want to count it's children: ");
                int x = inp.nextInt();
                if(!q.search(x))
                    System.out.println("Error: This item doesn't exist.");
                else {
                    btsNode p = q.find(x);
                    System.out.println("Sum of children of item " + x + " is: " + q.sumOfChildren(p));
                }
            }
            else if (c == 9){
                System.out.println("The status of the tree is: ");
                if(q.isFullBST())
                    System.out.print("A full binary search tree\n");
                else
                    System.out.print("Not a full binary search tree\n");

            }
            else if (c == 10)
                System.out.println("Have a nice day, see you later.");
            else
                System.out.println("The number you entered is out of our menu, Please try " +
                        "with another number between 1 and 10.");

        } while (c != 10);
    }
}