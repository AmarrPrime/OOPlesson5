package org.example.Service;

import org.example.Data.Mail;

public interface MailInterface {

    String sendMail(Mail data);

     void recieveMail();

     void returnMail();
}
