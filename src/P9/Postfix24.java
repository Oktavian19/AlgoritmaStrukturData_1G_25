package P9;

public class Postfix24 {
    int n, top;
    char[] stack;

    Postfix24(int total) {
        n = total;
        top = -1;
        stack = new char[n];
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
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.';
    }

    boolean isOperator(char c) {
        return c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+';
    }

    int derajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    String konversi(String Q) {
        String P = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (isOperand(c)) {
                P = P + c;
            }
            if (c == '(') {
                push(c);
            }
            if (c == ')') {
                while (stack[top] != '(') {
                    P = P + pop();
                }
                pop();
            }
            if (isOperator(c)) {
                while (derajat(stack[top]) >= derajat(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }
}