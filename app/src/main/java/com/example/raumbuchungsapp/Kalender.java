package com.example.raumbuchungsapp;

import java.sql.Time;
import java.util.Date;

public class Kalender
{

  private Date zeitvon;

  public Date getZeitvon() {
    return zeitvon;
  }

  private Date zeitbis;

  public Date getZeitbis() {
    return zeitbis;
  }

  public void setZeitbis(Date zeitbis) {
    this.zeitbis = zeitbis;
  }




  public void setZeitvon(Date zeitvon) {
    this.zeitvon = zeitvon;
  }


  public Kalender(Date zeitvon, Date zeitbis)
  {
    this.zeitvon = zeitvon;
    this.zeitbis = zeitbis;
  }



}
