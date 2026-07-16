package org.example;

public interface Notification {
    void send();
}

class SMSNotification implements Notification {

    @Override
    public void send() {
        System.out.println("SMS Sent");
    }
}

class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Email Sent");
    }
}

class WhatsAppNotification implements Notification {
    @Override
    public void send() {
        System.out.println("WhatsApp Sent");
    }
}