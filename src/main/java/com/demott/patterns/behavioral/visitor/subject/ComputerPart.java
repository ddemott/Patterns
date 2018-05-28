package com.demott.patterns.behavioral.visitor.subject;

import com.demott.patterns.behavioral.visitor.visitor.ComputerPartVisitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
