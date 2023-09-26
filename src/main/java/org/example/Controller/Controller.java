package org.example.Controller;

import org.example.Data.Mail;
import org.example.MVP.HumanMailView;
import org.example.Service.MailService;

public class Controller {

    MailService mailService = new MailService();
    HumanMailView humanMailView = new HumanMailView();

    public void start(Mail sendMail) {
        String qwe = mailService.sendMail(sendMail);
        humanMailView.GetMail(qwe);
    }

    public void start(String s) {
    }
}
