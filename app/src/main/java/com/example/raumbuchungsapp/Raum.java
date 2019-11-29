package com.example.raumbuchungsapp;

public class Raum
{
    private int ID;
    private String raumname;

    public Raum(String raumname, int ID)
    {
        this.ID = ID;
        this.raumname = raumname;
    }

    public int getID() {
        return ID;
    }

    public String getRaumname() {
        return raumname;
    }

    public void setRaumname(String raumname) {
        this.raumname = raumname;
    }

    public void setID(int ID) {
        this.ID = ID;

    }


}
