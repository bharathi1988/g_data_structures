package com.galvanize;



public class Stack {
    private java.util.Stack<Node> stack;

    Stack(){
        stack = new java.util.Stack<>();
    }
    public boolean isEmpty() {
        if(!stack.isEmpty())
            return false;
        return true;
    }

    public void push(Node node) {
        stack.push(node);
    }

    public int count() {
        return stack.size();
    }

    public Node pop() {
        return stack.pop();
    }

    public Node peek() {
        return stack.peek();
    }
}
