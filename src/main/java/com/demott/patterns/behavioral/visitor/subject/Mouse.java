package com.demott.patterns.behavioral.visitor.subject;

import com.demott.patterns.behavioral.visitor.visitor.ComputerPartVisitor;

public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
