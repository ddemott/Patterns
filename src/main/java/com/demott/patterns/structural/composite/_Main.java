package com.demott.patterns.structural.composite;

public class _Main {

    public static void main(String[] args) {
        Node node1 = new Node("root node");
        node1.addLeaf("first leaf");
        node1.addLeaf("second leaf");
        node1.addNode("first node");
        node1.addNode("second node");
        
        System.out.println(node1.ls("  "));
    }
}
