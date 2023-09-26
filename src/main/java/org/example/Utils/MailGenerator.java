package org.example.Utils;

import org.example.Data.Human;
import org.example.Data.Mail;
import org.example.Data.Postman;

public class MailGenerator {
    public Mail generateMail(){
        return new Mail(new Human("Address","Random String"),new Postman("Boss of the mail"),"Lenin st","data");
    } // S from SOLID

}
