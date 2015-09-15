package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by dshin on 9/15/15.
 */
public abstract class CurrentMood extends Object{
    public abstract Boolean isHappy();
    private String format;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return format;
    }

    public void setText(String text) {
        this.format = text;
    }

    public CurrentMood() {
        this.format = "";
        this.date = new Date();
    }

    public CurrentMood(Date date) {
        this.format = "";
        this.date = date;
    }
}

