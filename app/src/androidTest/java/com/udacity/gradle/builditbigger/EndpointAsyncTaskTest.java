package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by raed on 6/8/18.
 */

@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest {
    @Test
    public void testInBackground () throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.setTestResult(true);
        task.execute(new Pair<>(InstrumentationRegistry.getContext(), "Some joke"));
        countDownLatch.await(3000, TimeUnit.MILLISECONDS);
        assert EndpointsAsyncTask.testResult != null;
    }
}
