package org.example.Data;

public class Mail {
    private Human to;
    private Postman from;

    private String address;
    private  String data;

    public Mail() {
        this.to = to;
        this.from = from;
        this.address = address;
        this.data = data;
    }

    public Mail(Human boris, Postman postman) {
    }

    public Mail generateNewMail(){

    return new Mail(new Human("Boris", "Lenin 22") ,
        new Postman("Gsom", "Bjne","addresssss","asdgjnasdfgjnlmajnsdfgjkn"));
    }

}
