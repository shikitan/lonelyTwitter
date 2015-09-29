package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by dshin on 9/29/15.
 */
public class TweetList {

    private Tweet mostRecentTweet;
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) {
        if (tweets.contains(tweet)){
            try {
                throw new IllegalArgumentException();
            }catch (IllegalArgumentException iae) {

            }
        }
        else {
            mostRecentTweet = tweet;
            tweets.add(tweet);
        }
    }

    public Tweet getMostRecentTweet(){
        return mostRecentTweet;
    }

    public int count(){
        return tweets.size();
    }

    public String getTweets() {
        String [] listTweets = tweets.toArray(new String[tweets.size()]);
        return listTweets;
    }
}
