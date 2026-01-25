package gr.aueb.cf.cf9.ch06;

public class StackApp {
    static int [] stack = new int[10];
    static  int top = -1;
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);
        push(7);
        push(8);
        push(9);
        push(10);
        push(11);
        push(12);
        int a = pop();
        int b = pop();
       for (int i = 0; i <= (top); i++){
           System.out.println(stack[i]);
       }

    }
    public static void push(int num){
        if (isFull() == true){
            System.err.println("Error");
            return;
        }
        top ++;
        stack[top] = num;
        //stack[++top] = num;
    }
    public static int pop(){
        if (isEmpty() == true){
        throw new RuntimeException("Stack is empty");
        }
        int num = stack[top];
        top--;
        return num;
    }
    public static boolean isEmpty(){
        return  top == -1;
    }
    public static boolean isFull(){
        return top == stack.length - 1;
    }
}
