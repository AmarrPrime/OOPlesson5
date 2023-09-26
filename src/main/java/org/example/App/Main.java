package org.example.App;

import org.example.Controller.Controller;
import org.example.Data.Mail;
import org.example.MVP.HumanMailView;
import org.example.MVP.View;
import org.example.Service.MailInterface;
import org.example.Service.MailService;
import org.example.Utils.MailGenerator;

public class Main {
    public static void main(String[] args) {
        MailInterface mailInterface = new MailService();
        View view = new HumanMailView();
        Controller controller = new Controller(mailInterface,view);
        MailGenerator mailGenerator = new MailGenerator();
        Mail mail = mailGenerator.generateMail();
        controller.start(mail);
    }
}
