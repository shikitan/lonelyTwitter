package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by dshin on 9/15/15.
 */
public abstract class CurrentMood extends Object{
    public abstract Boolean isHappy();

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getText();


    public CurrentMood() {
        this.date = new Date();
    }

    public CurrentMood(Date date) {
        this.date = date;
    }
}

