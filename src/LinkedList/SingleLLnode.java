package LinkedList;

public class SingleLLnode {
    public int id; // data part
    public SingleLLnode next; // Link part

    public SingleLLnode(int i)
    {
        this.id = i;
        this.next = null;
    }
    public SingleLLnode(int i, SingleLLnode h)
    {
        this.id = i;
        this.next = h;
    }
}
