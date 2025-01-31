package LinkedList;

public class double_LLnode {
    public String name;
    public double_LLnode next, prev;

    public double_LLnode(String n)
    {
        this(n, null, null);
    }
    public double_LLnode(String n, double_LLnode p, double_LLnode nxt)
    {
        this.name = n;
        this.prev = p;
        this.next = nxt;
    }
}
