package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

/**
 * Created by joshua2 on 9/29/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 implements MyObserver{
    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testHoldsStuff() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertSame(list.getMostRecentTweet(), tweet);
    }

    public void testHoldsManyThings() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertEquals(list.count(), 1);
        list.add(new NormalTweet("test"));
        assertEquals(list.count(), 2);
    }

    public void myNotify(MyObservable observable) {
        weWereNotified = Boolean.TRUE;
    }

    private Boolean weWereNotified;

    public void testObservable(){
        TweetList list = new TweetList();
        // needs an addObserver
        list.addObserver(this);
        Tweet tweet = new NormalTweet("test");
        //we shouldnt have gotten notified here
        weWereNotified = Boolean.FALSE;
        list.add(tweet);
        //weshould have been notified here
        assertTrue(weWereNotified);
    }

    public void testModifyTweetInList(){
        TweetList list = new TweetList();
        // needs an addObserver
        list.addObserver(this);
        Tweet tweet = new NormalTweet("test");
        //we shouldnt have gotten notified here
        list.add(tweet);
        weWereNotified = Boolean.FALSE;
        tweet.setText("different text");
        //weshould have been notified here
        assertTrue(weWereNotified);}
}
