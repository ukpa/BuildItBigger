package com.udacity.gradle.builditbigger;

import android.provider.Settings;
import android.test.ActivityTestCase;

import org.junit.Test;

/**
 * Created by unnikrishnanpatel on 26/04/16.
 */
public class AsyncTaskTest extends ActivityTestCase {

   @Test
    public void testInBackGround(){

        new EndpointsAsyncTask(new Listener() {
            @Override
            public void executeJoke(String joke) {
                assertTrue("Error: Fetched Joke = " + joke , joke != null);
            }
        }).execute();

    }

}
