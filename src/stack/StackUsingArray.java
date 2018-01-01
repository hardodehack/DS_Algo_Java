package stack;

public class StackUsingArray {

    final static int MAX = 1000;
    int top;

    StackUsingArray(){
        top = -1;
    }

    int[] stack = new int[MAX];

    public boolean isEmpty(){

        if(top==-1) return true;

        return false;
    }

    public synchronized boolean  push(int data){
        System.out.println("Executing push operation... for "+data);
        if(top == 1000){
            System.err.println("Uhhhh... STACK OVERFLOW........");
            return false;
        }
        stack[++top] = data;
        return true;
    }

    public synchronized int pop(){
        System.out.println("Executing pop operation...");
        if(top == -1){
            System.err.println("Uhhhh... STACK UNDERFLOW........");
            return 0;
        }
        return stack[top--];
    }

    public synchronized int peep(){
        if(top == -1){
            System.err.println("Uhhhh... STACK UNDERFLOW........");
            return 0;
        }
        return stack[top];
    }

    public static void main(String[] args) {
        StackUsingArray s1 = new StackUsingArray();

        s1.push(12);
        s1.push(13);
        s1.push(14);
        s1.push(15);

        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());

        System.out.println(s1.pop());
    }
}
