package com.bustamante.journalapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 660252306 on 12/19/2016.
 */
public class Entry
{
    private String title;
    private String content;
    private Date date;

    public Entry(){
        setTitle("");
        setContent("");
        Date dateObject = new Date();
        setDate(dateObject);
    }

    public Entry(String title, String content){
        this.setTitle(title);
        this.setContent(content);
        Date dateObject = new Date();
        this.setDate(dateObject);
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setContent(String content)
    {
        this.content = content;
    }
    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public Date getDate() {
        return date;
    }

}
