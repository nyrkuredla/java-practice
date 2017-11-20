package com.company;

public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    //constructor
    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        printWhee();
    }

    //getters
    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
//        super.transport();
        System.out.println(getBody());
        System.out.println(getSubject());
        System.out.println(getCreatedAt());
        System.out.println(this.recipient);
        System.out.println(this.smtpProvider);
        System.out.println(this.status);
    }

    @Override
    public void printWhee() {
        super.printWhee();
        System.out.println("hoorayyyyyy");
    }
}
