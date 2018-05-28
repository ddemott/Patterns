package com.demott.patterns.behavioral.visitor;

import com.demott.patterns.behavioral.visitor.subject.Computer;
import com.demott.patterns.behavioral.visitor.subject.ComputerPart;
import com.demott.patterns.behavioral.visitor.visitor.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
