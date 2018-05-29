package com.demott.patterns.behavioral.command.commands.email;

import com.demott.patterns.behavioral.command.commands.base.Command;

public class SendEmailCommand implements Command {

    private EmailContainer emailContainer;

    public SendEmailCommand(EmailContainer emailContainer) {
        this.emailContainer = emailContainer;
    }

    @Override
    public void execute() {
        /** Email configuration, setup and sending of email code goes here. **/
        System.out.println("FROM:" + emailContainer.getFrom());
        System.out.println("TO:" + emailContainer.getTo());
        System.out.println("SUBJECT:" + emailContainer.getSubject());
        System.out.println("BODY:" + emailContainer.getBody());
    }

}
