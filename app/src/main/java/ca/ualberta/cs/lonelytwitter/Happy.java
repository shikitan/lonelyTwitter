package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by dshin on 9/15/15.
 */
public class Happy extends CurrentMood {
    public Happy() {

        super();
    }

    public Happy (Date date) {

        super(date);
    }

    public Boolean isHappy() {

        return Boolean.TRUE;
    }

    public String getText() {
        return "--is feeling happy";
    }
}