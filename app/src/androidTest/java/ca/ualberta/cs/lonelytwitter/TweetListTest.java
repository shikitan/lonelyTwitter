package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

/**
 * Created by dshin on 9/29/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testHoldsStuff() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertSame(list.getMostRecentTweet(), tweet);
    }

    public void testHoldsManyThings() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertEquals(list.count(), 1);
        list.addTweet(new NormalTweet("test"));
        assertEquals(list.count(), 2);
    }

    public void testDuplicateTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertEquals(list.count(), 1);
        list.addTweet(tweet);
        assertEquals(list.count(), 1);
    }
    private String listTweets;
    public void testReturnTweets() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("hello");
        list.addTweet(tweet);
        Tweet tweet2 = new NormalTweet("hi");
        list.addTweet(tweet2);
        listTweets = list.getTweets();
        assertSame(listTweets, "hello hi");
    }
}