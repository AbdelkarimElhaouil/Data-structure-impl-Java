package LinkedList;

public class SingleLinkedList<T> {
    private SingleLLnode<T> head;
    private SingleLLnode<T> tail;
    private int size = 0;

    public SingleLinkedList()
    {
        head = null;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void addAt(T e, int ind){
        if(size == 0){
            if(ind != 0)
                System.out.println("list is empty, index is not valid.");
            else
                add(e);
        }
        else if(ind < 0){
            System.out.println("invalid operation, index must be positive.");
        }
        else if(ind > size){
            System.out.println("index out of range");
        }
        else if(ind == 0) {
            addFront(e);
        }
        else {
            SingleLLnode<T> newNode = new SingleLLnode<>(e);
            SingleLLnode<T> helpPtr = head;
            for (int i = 1; i < ind-1; ++i)
            {
                helpPtr = helpPtr.next;
            }
            newNode.next = helpPtr.next;
            helpPtr.next = newNode;
            size++;
        }
    }

    public void addFront(T e){
        head = new SingleLLnode<>(e, head);
        size++;
    }
    public void add(T e)
    {
        if(isEmpty()) {
            head = new SingleLLnode<>(e);
            System.out.println("Object " + e + " was successfully added");
            size++;
        }
        else {
            SingleLLnode<T> helpPtr = head;
            while (helpPtr.next != null) {
                helpPtr = helpPtr.next;
            }
            helpPtr.next = new SingleLLnode<>(e);
            tail = helpPtr.next;
            System.out.println("Object " + e + " was successfully added.");
            size++;
        }
    }
    public void deleteFront()
    {
        if(isEmpty())
            System.out.println("Empty List, Nothing to delete");
        else {
            head = head.next;
            size--;
        }
    }
    public void deleteBack()
    {
        if(isEmpty())
            System.out.println("Empty List, Nothing to delete.");
        else if (size == 1) {
            deleteFront();
            System.out.println("The list has only one node which has been deleted");
        }
        else {
            SingleLLnode<T> helpPtr = head;
            while (helpPtr.next.next != null) {
                helpPtr = helpPtr.next;
            }
            helpPtr.next = null;
            size--;
            System.out.println("Last node have been deleted successfully");
        }
    }
    public void delete(int ind)
    {
        if(isEmpty())
            System.out.println("Empty List, Nothing to delete.");
        else if (ind == 0) {
            deleteFront();
        }
        else if (ind >= size) {
            System.out.println("Index not found, Out of Range.");
        }
        else {
            SingleLLnode<T> helpPtr = head;
            while (ind - 1 > 0) {
                helpPtr = helpPtr.next;
                ind--;
            }
            helpPtr.next = helpPtr.next.next;
            size--;
        }
    }

    public void print(){
        if(isEmpty())
            System.out.println("Empty List, nothing to display.");
        else {
            SingleLLnode<T> helpPtr = head;
            while (helpPtr != null) {
                System.out.println(helpPtr.data);
                helpPtr = helpPtr.next;
            }
        }
    }
    public int get_size()
    {
        return size;
    }

    public void deleteNodesAfter(T v){ // delete after equal node
        if(isEmpty()){
            System.out.println("Can't delete from an empty list");
        }
        else if(search(v)) {
            SingleLLnode<T> helpPtr = head;
            if (head.data == v){
                head.next = head.next.next;
            }
            else {
                while (helpPtr.next != null) {
                    if (helpPtr.data == v)
                        helpPtr.next = helpPtr.next.next;
                    helpPtr = helpPtr.next;
                    if(helpPtr.next == null && helpPtr.data == v)
                        System.out.println("there is no node to delete after that.");
                }
                System.out.println("node had been deleted successfully");
            }
        }
        else
            System.out.println("Can't Added,no node with that value.");
    }

    public boolean search(T value){
        SingleLLnode<T> helpPtr = head;
        while(helpPtr != null){
            if(helpPtr.data == value)
                return true;
            helpPtr = helpPtr.next;
        }
        return false;
    }

    public void swapFirstLast()
    {
        if(size < 2)
            System.out.println("Can't swap, list has less than two nodes.");
        else if (size == 2) {
            SingleLLnode<T> tmp = head, helpPtr = head.next;
            helpPtr.next = head;
            head = helpPtr;
            tmp.next = null;
        } else {
            SingleLLnode<T> helpPtr = head;
            while(helpPtr.next.next != null){
                helpPtr = helpPtr.next;
            }
            SingleLLnode<T> tmp = head;
            helpPtr.next.next = head.next;
            head = helpPtr.next;
            helpPtr.next = tmp;
            tmp.next = null;
        }
    }

    public SingleLLnode<T> getByIndex(int ind){
        if (head == null){
            System.out.println("list is empty.");
            return null;
        }
        else if(ind > size){
            System.out.println("index out of range");
            return null;
        } else if (ind < 0) {
            System.out.println("Can't perform this operation, index must be positive");
        }
        SingleLLnode<T> helpPtr =  head;
        for(int i = 0; i < ind; ++i){
            helpPtr = helpPtr.next;
        }
        return  helpPtr;
    }

    public SingleLLnode<T> get2ndNode(){
        return get2ndNode(head);
    }
    private SingleLLnode<T> get2ndNode(SingleLLnode<T> h){
        if(isEmpty() || head.next == null) {
            System.out.println("Cannot find second node, list has less than one element.");
            return null;
        }
        else return head.next;
    }
    public SingleLLnode<T> get2ndLastNode(){
        return get2ndLastNode(head);
    }
    private SingleLLnode<T> get2ndLastNode(SingleLLnode<T> h){
        if(isEmpty() || head.next == null) {
            System.out.println("Cannot find second last node, list has less than one element.");
            return null;
        }
        else {
            while(h.next.next != null)
                h = h.next;
            return h;
        }
    }
    public SingleLLnode<T> getFirst()
    {
        if(isEmpty())
            return null;
        return head;
    }
    public SingleLLnode<T> getLast()
    {
        if(isEmpty())
            return null;
        SingleLLnode<T> helpPtr = head;
        while(helpPtr.next != null)
            helpPtr = helpPtr.next;
        return helpPtr;
    }
//  ****** Methods bellow are used only for types that extends Number *********

//    public void even2odd2Even(){
//        even2odd2Even(head);
//    }
//    private void even2odd2Even(SingleLLnode<T> h){
//        if(isEmpty())
//            System.out.println("Error, An empty list.");
//        while(h != null){
//            if(h.data % 2 == 0)
//                h.data += 1;
//            else
//                h.data -= 1;
//            h = h.next;
//        }
//    }
    //    public int countEvenNodes(){
//        SingleLLnode<T> helpPtr = head;
//        int c = 0;
//        while(helpPtr != null){
//            if(helpPtr.data % 2 == 0)
//                c++;
//            helpPtr = helpPtr.next;
//        }
//        return c;
//    }
//
//    public int countOddNodes(){
//        return size - countEvenNodes();
//    }
//    public void printEvenNodes()
//    {
//        if(isEmpty())
//            System.out.println("Empty list, nothing to display");
//        else {
//            SingleLLnode<T> helpPtr = head;
//            while (helpPtr != null) {
//                if (helpPtr.data % 2 == 0)
//                    System.out.println(helpPtr.data + " ");
//                helpPtr = helpPtr.next;
//            }
//        }
//    }
    //    public int findLargest(){
//        int largest = 0;
//        if(isEmpty())
//            System.out.println("Cannot Find Largest Id, empty linked list.");
//        else {
//            largest = head.data;
//            SingleLLnode<T> helpPtr = head.next;
//            while (helpPtr != null) {
//                if (helpPtr.data > largest)
//                    largest = helpPtr.data;
//            helpPtr = helpPtr.next;
//            }
//        }
//            return largest;
//    }
    //    public void addNodesAfter(T v){// add after its divisor by 2
//        if(isEmpty()){
//            System.out.println("Can't added to an empty list");
//        }
//        else if(search(v)) {
//            SingleLLnode<T> helpPtr = head;
//            if (head.data == v){
//                head.next = new SingleLLnode<T>(v*2, head.next);
//            }
//            else {
//                while (helpPtr.next != null) {
//                if (helpPtr.data == v) {
//                    helpPtr.next = new SingleLLnode<T>(v*2, helpPtr.next);
//                }
//                helpPtr = helpPtr.next;
//                }
//                System.out.println("node had been added successfully");
//            }
//        }
//            else
//                System.out.println("Can't added, no node with that value.");
//    }
//    public void deleteFromSortedList(int v)
//    {
//        if(!isEmpty()) {
//            if (head.data == v)
//                head = head.next;
//        }
//        else {
//            SingleLLnode<T> helpPtr = head;
//            while(size > 0){
//                if (helpPtr.next.data == v) {
//                    helpPtr.next = helpPtr.next.next;
//                    break;
//                }
//                //helpPtr = helpPtr.next;
//                size--;
//            }
//        }
//    }
    //    public void sort()
//    {
//        SingleLLnode<T> ptr1 = head;
//        for(int i = 0; i < size; ++i){
//            SingleLLnode<T> ptr2 = ptr1.next;
//            for(int j = i + 1; j < size; ++j){
//                //if(ptr1.)
//            }
//        }
//    }
//    public void addToSortedList(int v)
//    {
//        if(head.data > v || isEmpty()){
//            addFront(v);
//        }
//        else {
//            SingleLLnode<T> helpPtr = head;
//            while(helpPtr.next != null){
//                if (helpPtr.next.data > v)
//                    break;
//                helpPtr = helpPtr.next;
//            }
//            helpPtr.next = new SingleLLnode<T>(v, helpPtr.next);
//            size++;
//        }
//    }

}
