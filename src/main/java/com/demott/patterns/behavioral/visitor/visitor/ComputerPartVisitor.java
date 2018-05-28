package com.demott.patterns.behavioral.visitor.visitor;

import com.demott.patterns.behavioral.visitor.subject.Computer;
import com.demott.patterns.behavioral.visitor.subject.Keyboard;
import com.demott.patterns.behavioral.visitor.subject.Monitor;
import com.demott.patterns.behavioral.visitor.subject.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}