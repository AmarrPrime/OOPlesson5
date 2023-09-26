package org.example.Controller;

import org.example.Data.Mail;
import org.example.MVP.View;
import org.example.Service.MailInterface;

public class Controller {

    MailInterface mailService; //L and D from SOLID
    View humanMailView; //L adn D from SOLID

    public Controller(MailInterface mailService, View humanMailView) {
        this.mailService = mailService;
        this.humanMailView = humanMailView;
    }

    public void start(Mail sendMail) {
        String qwe = mailService.sendMail(sendMail);
        humanMailView.GetMail(qwe);
    }
}
