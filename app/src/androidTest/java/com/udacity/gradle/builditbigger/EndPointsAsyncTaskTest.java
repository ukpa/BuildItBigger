package com.udacity.gradle.builditbigger;

import org.junit.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityTestCase;

/**
 * Created by unnikrishnanpatel on 26/04/16.
 */
@RunWith(AndroidJUnit4.class)
public class EndPointsAsyncTaskTest extends ActivityTestCase {

    @Test
    public void testInBackGround() throws Exception{

        new EndpointsAsyncTask(new Listener() {
            @Override
            public void executeJoke(String joke) {
                assertTrue("Error: Fetched Joke = " + joke , joke!=null );
            }
        }).execute();

    }

}