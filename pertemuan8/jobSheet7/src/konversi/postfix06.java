package konversi;

public class postfix06 {
    int top, n;
    char stack[];

    postfix06(int total) {
        this.n = total;
        this.top = -1;
        this.stack = new char[n];
        push('(');
    }

    void push(char c) {
        top++;
        stack[top] = c;
    }

    char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    boolean isOperand(char c) {
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    boolean isOperator(char c) {
        if(c == '^' || c == '%' || c == '/' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    int derajat(char c) {
        switch (c) {
            case '^':
                return 3;
                
            case '%':
                return 2;
                
            case '/':
                return 2;
                
            case '-':
                return 1;
                
            case '+':
                return 1;
                

            default:
                return 0;
                
        }
    }

    String konversi(String q) {
        String p = "";
        char c;

        for(int i = 0; i < n; i++) {
            c = q.charAt(i);

            if(isOperand(c)){
                p = p + c;
            }

            if(c == '('){
                push (c);
            }

            if(c == ')'){
                p = p + pop();
            }

            if(isOperator(c)){
                while(derajat(stack[top]) >= derajat(c)) {
                    p = p + pop();
                }
                push(c);
            }
        }
        return p;
    }
}
