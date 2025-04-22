package LinkedList;

public class double_LLnode<T> {
    public T data;
    public double_LLnode<T> next, prev;

    public double_LLnode(T n)
    {
        this(n, null, null);
    }
    public double_LLnode(T n, double_LLnode<T> prec, double_LLnode<T> nxt)
    {
        this.data = n;
        this.prev = prec;
        this.next = nxt;
    }
}
