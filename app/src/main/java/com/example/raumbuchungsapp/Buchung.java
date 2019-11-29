package com.example.raumbuchungsapp;

import java.sql.Date;
import java.sql.Time;

public class Buchung
{
    User user;
    Raum raum;
    Date zeitvon;
    Date zeitbis;


    public Buchung(User user, Raum raum, Date zeitvon, Date zeitbis)
    {
        this.user = user;
        this.raum = raum;
        this.zeitbis = zeitbis;
        this.zeitvon = zeitvon;
    }
}
