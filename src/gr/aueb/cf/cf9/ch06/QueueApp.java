package gr.aueb.cf.cf9.ch06;

import java.util.Arrays;

public class QueueApp {
    static int[] queue = new int[10];
    static int top = -1;
    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        enqueue(6);
        printQueue();

    }
    public static void printQueue(){
        for (int i = 0; i <= top; i++){
            System.out.println(queue[i]);
        }

    }
    public static void enqueue(int item){
        queue[++top] = item;
    }
    public static int dequeue(){
        int num = queue[0];
        queue = Arrays.copyOfRange(queue, 1, queue.length);
        top --;
        return num;
    }
}
