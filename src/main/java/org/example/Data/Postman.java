package org.example.Data;

public class Postman extends User {
    private String occupation;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Postman(String occupation) {
        super();
        this.occupation = occupation;
    }
}
