package com.example.ormlitedemo.Classes;

import com.j256.ormlite.field.DatabaseField;

import java.util.Date;

public class Note {

//    The @DatabaseTable annotation configures the Note class to be persisted to the database table named Note
    //Database field will automatically generate id
    @DatabaseField(generatedId = true)
    int id;
    @DatabaseField
    String subject;
    @DatabaseField
    String text;
    @DatabaseField
    Date date;

    //create constructor
    public Note(){

    }
    //generate constructor for subject and text
    public Note(String subject, String text) {
        super();
        this.subject = subject;
        this.text = text;
        this.date = new Date(System.currentTimeMillis());
    }
    //genarate get tostring
    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}
