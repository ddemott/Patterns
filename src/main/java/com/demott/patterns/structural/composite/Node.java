package com.demott.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Node extends Component {
    private List<Component> components = new ArrayList<>();

    public String ls(String leftPadding) {
        String listDirectoryString = "";
        listDirectoryString = leftPadding + this.getName() + "\n";

        for (Component component : components) {
            listDirectoryString += leftPadding + leftPadding + component.getName() + "\n";
        }

        return listDirectoryString;
    }

    public Node(String name) {
        super.setName(name);
    }

    public void addNode(String nodeName) {
        components.add(new Node(nodeName));
    }

    public void addLeaf(String leafName) {
        components.add(new Leaf(leafName));
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

}
