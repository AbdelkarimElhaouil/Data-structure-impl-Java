package Stack;

public class stackFunc {
    static public int prec(char c){
        int a = 0;
        switch (c){
            case '+':
                a = 1;
            case '-':
                a = 1;
            case '*':
                a = 2;
            case '/':
                a = 2;
        }
        return a;
    }
    static public String infixToPostfix(String s){
        StringStack st = new StringStack(s.length());
        String postfix = "";
        for(int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c))
                postfix += c;
            else if(c == '(' || st.isEmpty())
                st.push(c);
            else if (c == ')') {
                while(!st.isEmpty() && st.getTop() != '(') {
                    postfix += st.pop();
                }
                st.pop();
            }
            else {
                while(!st.isEmpty() && prec(c) <= prec(st.getTop())) {
                    postfix += st.pop();
                }
                st.push(c);
            }

        }
        while (!st.isEmpty())
            postfix += st.pop();
        return postfix;
    }
}
