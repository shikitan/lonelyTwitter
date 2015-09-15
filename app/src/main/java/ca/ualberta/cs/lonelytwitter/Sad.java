package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by dshin on 9/15/15.
 */
public class Sad extends CurrentMood {
    public Sad() {
        super();
    }

    public Sad (Date date) {
        super();
    }

    public Boolean isHappy() {
        return Boolean.FALSE;
    }
    public String getText() {
        return "--is feeling sad";
    }
}