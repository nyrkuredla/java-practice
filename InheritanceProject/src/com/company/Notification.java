package com.company;
import java.time.LocalDateTime;

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    //constructor
    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
        this.status = "Sent";
    }

    //getters


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    //methods
    public void transport() {
        throw new NoTransportException();
    }

    public void showStatus() {
        System.out.println(this.status);
    }

    protected void printWhee() {
        System.out.println("Wheeeeeeeeee");
    }
}
