package com.demott.patterns.behavioral.visitor.visitor;

import com.demott.patterns.behavioral.visitor.subject.Computer;
import com.demott.patterns.behavioral.visitor.subject.Keyboard;
import com.demott.patterns.behavioral.visitor.subject.Monitor;
import com.demott.patterns.behavioral.visitor.subject.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
