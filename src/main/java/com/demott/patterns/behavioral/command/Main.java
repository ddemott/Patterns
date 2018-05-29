package com.demott.patterns.behavioral.command;

import com.demott.patterns.behavioral.command.commands.base.Command;
import com.demott.patterns.behavioral.command.commands.email.EmailContainer;
import com.demott.patterns.behavioral.command.commands.email.SendEmailCommand;

public class Main {

    private EmailContainer emailContainer;

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        emailContainer = new EmailContainer("DaleDeMott@gmail.com", "JonDoe@gmail.com", "My Subject", "Body of email.");
        Command sendEmailCommand = new SendEmailCommand(emailContainer);
        sendEmailCommand.execute();
    }

}
