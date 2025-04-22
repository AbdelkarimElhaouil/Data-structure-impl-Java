package LinkedList;

public class SingleLLnode<T> {
    public T data; // data part
    public SingleLLnode<T> next; // Link part

    public SingleLLnode(T i)
    {
        this.data = i;
        this.next = null;
    }
    public SingleLLnode(T i, SingleLLnode<T> l)
    {
        this.data = i;
        this.next = l;
    }
}
