package org.example.Service;

import org.example.Data.Mail;

public interface MailInterface {
    public void sendMail();

    String sendMail(Mail data);

    public void recieveMail();

    public void returnMail();
}
