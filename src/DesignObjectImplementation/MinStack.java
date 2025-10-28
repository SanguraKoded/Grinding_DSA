package DesignObjectImplementation;

public class MinStack {
    Node head;

    private class Node{
        int val;
        Node next;
        int min;

        Node(int val){
            this.val = val;
        }
    }

    public MinStack() {
    }

    public void push(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        newNode.min = Math.min(head.min, val);
        head = newNode;
    }

    public void pop() {
        if(head == null){
            return;
        }
        head = head.next;
    }

    public int top() {
        if(head == null){
            return -1;
        }
        return head.val;
    }

    public int getMin() {
        if(head == null){
            return -1;
        }
        return head.min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
