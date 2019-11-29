package com.example.raumbuchungsapp;

public class User
{
    private String Benutzername;
    private String Passwort;
    private int ID;
    private int Matrikelnummer;

    public User(String Benutzername, String Passwort, int ID, int Matrikelnummer)
    {
        this.Benutzername = Benutzername;
        this.Passwort = Passwort;
        this.ID = ID;
        this.Matrikelnummer = Matrikelnummer;
    }

    public String getBenutzername() {
        return Benutzername;
    }

    public void setBenutzername(String benutzername) {
        Benutzername = benutzername;
    }

    public String getPasswort() {
        return Passwort;
    }

    public void setPasswort(String passwort) {
        Passwort = passwort;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMatrikelnummer() {
        return Matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        Matrikelnummer = matrikelnummer;
    }
}
