package com.demott.patterns.behavioral.command.commands;

import com.demott.patterns.behavioral.command.Command;
import com.demott.patterns.behavioral.command.delegates.EmailContainer;

public class SendEmailCommand implements Command {

    private EmailContainer emailContainer;

    public SendEmailCommand(EmailContainer emailContainer) {
        this.emailContainer = emailContainer;
    }

    @Override
    public void execute() {
        System.out.println("FROM:" + emailContainer.getFrom());
        System.out.println("TO:" + emailContainer.getTo());
        System.out.println("SUBJECT:" + emailContainer.getSubject());
        System.out.println("BODY:" + emailContainer.getBody());
    }

}
