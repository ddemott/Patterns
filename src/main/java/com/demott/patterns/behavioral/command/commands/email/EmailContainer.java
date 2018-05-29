package com.demott.patterns.behavioral.command.commands.email;

public class EmailContainer {

    public EmailContainer(String from, String to, String subject, String body) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    public String from;
    public String to;
    public String subject;
    public String body;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String sendEmail() {
        System.out.println("from:" + from);
        System.out.print("to:" + to);
        System.out.println();
        System.out.println("subject:" + subject);
        System.out.println("");
        System.out.println(body);
        return "";
    }

}
