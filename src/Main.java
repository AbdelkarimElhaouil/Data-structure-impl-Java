import java.util.Arrays;
import java.util.LinkedList;

import LinkedList.*;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<>();
        list.add("abs");
        list.add("aaaa");
        System.out.println(list.get_size());
        list.addAt("xxx", 2);
        list.addAt("jjj", 3);
        list.print();
    }
}