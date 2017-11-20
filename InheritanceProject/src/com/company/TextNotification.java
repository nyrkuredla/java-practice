package com.company;

public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() {
//        super.transport();
        System.out.println(getBody());
        System.out.println(getSubject());
        System.out.println(getCreatedAt());
        System.out.println(this.recipient);
        System.out.println(this.smsProvider);
    }
}
