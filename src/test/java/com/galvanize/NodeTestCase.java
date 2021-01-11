package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTestCase {

    @Test
    void testNodesEqual_String() {
        Node treeNode = new Node("Tree");
        Node node1 = new Node("Tree");
        assertEquals(treeNode.toString(), node1.toString());
        Node bushNode = new Node("Bush");
        assertNotEquals(treeNode.toString(), bushNode.toString());
    }

    @Test
    void testNodesEqual_Integer() {
        Node node1 = new Node(10);
        Node node2 = new Node(10);
        assertEquals(node1.toString(), node2.toString());
        Node node3 = new Node(100);
        assertNotEquals(node1.toString(), node3.toString());
    }
}