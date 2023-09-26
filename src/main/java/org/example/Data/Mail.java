package org.example.Data;

public class Mail {
    private User to;
    private User from;

    private String address;
    private String data;

    public Mail(User to, User from, String address, String data) {
        this.to = to;
        this.from = from;
        this.address = address;
        this.data = data;
    }// L from SOLID
}
