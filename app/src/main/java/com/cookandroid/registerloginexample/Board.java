package com.cookandroid.registerloginexample;

public class Board {
    String title;
    String content;

   // String date;


   Board() {}

    Board(String title, String content) {
        this.title = title;
        this.content = content;

        //this.date = date;
    }


    public String gettitle() {return title;}
    public String getcontent() {return content;}


    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }



  //  public void setDate(String date) {
      //  this.date = date;
    }

