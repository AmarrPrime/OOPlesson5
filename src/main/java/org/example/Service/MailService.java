package org.example.Service;

import org.example.Data.Mail;

public class MailService implements MailInterface {

    @Override
    public void sendMail() {

    }

    @Override
    public String sendMail(Mail data) {
        //System.out.println("Message sent.");
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
