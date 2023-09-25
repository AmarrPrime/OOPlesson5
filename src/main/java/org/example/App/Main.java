package org.example.App;

import org.example.Controller.Controller;
import org.example.Data.Mail;
import org.example.MVP.HumanMailView;
import org.example.MVP.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Mail mail = new Mail();
        mail = mail.generateNewMail();
        controller.start(mail);

    }
}
