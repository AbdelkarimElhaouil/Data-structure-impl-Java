package Queue;

import java.util.Scanner;

public class queueLab {

    public static void fillQueue(queueLL q){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 10 Values you want to add to the queue:");
        for(int i = 0; i < 2; i++){
            int val = inp.nextInt();
            q.enqueue(val);
        }
    }
    public static void sepEvenAndOdd(queueLL q){
        //queueNode hlp = q.getFront();
        queueLL evenQ = new queueLL(), oddQ= new queueLL();
        while (!q.isEmpty()){
            if (q.getFront().getData() % 2 == 0)
                evenQ.enqueue(q.dequeue().getData());
            else
                oddQ.enqueue(q.dequeue().getData());
        }
        q.print();
        System.out.println("Even elements: ");
        evenQ.print();
        System.out.println("Odd elements: ");
        oddQ.print();
    }
}