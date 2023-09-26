package org.example.Service;

import org.example.Data.Mail;

public class MailService implements MailInterface {

    @Override
    public String sendMail(Mail data) {
        return "Message " + data + " sent.";
    }

    @Override
    public void recieveMail() {
        System.out.println("Message recieved.");
    }

    @Override
    public void returnMail() {
        System.out.println("Message returned.");
    }
}
