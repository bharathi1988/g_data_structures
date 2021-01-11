package com.galvanize;

/*
    Node

    Nodes are the individual units contained in a data structure.

    A node is a value object, representing any type of value and
    providing a reference to the next node.
 */
public class Node {

    private String value;

    public Node(int i) {
        this.value = String.valueOf(i);
    }

    public Node(String s){
        this.value =  s;

    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                '}';
    }
}
