package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmailNotification dingEmail = new EmailNotification("Hello", "Hi there!", "Jenny", "Google");
        TextNotification beepText = new TextNotification(":)", "beep", "Chris", "Verizon");
        beepText.transport();
        dingEmail.transport();
        beepText.showStatus();
        dingEmail.showStatus();
        dingEmail.showStatus();
    }
}
