package com.galvanize;

import java.util.HashMap;
import java.util.Map;

public class Queue {
    private java.util.Queue<Node> queue;

    Queue(){
        queue = new java.util.LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enqueue(Node node) {
        queue.add(node);
    }

    public int length() {
        return queue.size();
    }

    public Node getFront() {
        return queue.peek();
    }

//    public Map.Entry<Object, Object> getRear() {
//        Map<Node, Object> rear = new HashMap<>();
//        for(Node )
//        return rear.entrySet();
//    }
}
