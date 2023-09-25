package org.example.MVP;

public class HumanMailView implements View{


    @Override
    public void ReturnMail() {
        System.out.println("Returned.");
    }

    @Override
    public void GetMail() {

    }

    @Override
    public void GetMail(String data) {
        System.out.println("Recieved.");
    }

    @Override
    public void SendMail() {
        System.out.println("Sent.");
    }

    @Override
    public void TalkToMailman() {
        System.out.println("Mailman talked with.");
    }
}
