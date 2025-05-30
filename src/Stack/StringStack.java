package Stack;

public class StringStack {
        private char[] str;
        private int top;
        private int size;

        public StringStack(){
            size = 0;
            top = - 1;
        }
        public StringStack(int s){
            size = s;
            str = new char[size];
            top = -1;
        }

        public boolean isEmpty(){
            return top == -1;
        }

        public boolean isFull(){
            return top == size - 1;
        }

        public void push(char val){
            if(isFull())
                System.out.println("Error: StackLL is already full, cannot push "+val+".");
            else
                str[++top] = val;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Error: cannot pop.");
                return 0;
            }
            return str[top--];
        }

        public char getTop(){
            if(isEmpty()){
                System.out.println("Error: There is no top, empty stack.");
                return 0;
            }
            return str[top];
        }
}


