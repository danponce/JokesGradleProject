package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static junit.framework.Assert.assertFalse;

@RunWith(AndroidJUnit4.class)
public class AndroidEndpointTest implements TaskCompleted
{
    String mResultString = null;
    CountDownLatch mSignal = null;

    @Test
    public void testAsyncTaskResult() throws InterruptedException
    {
        mSignal = new CountDownLatch(1);

        JokeAsyncTask jokeAsyncTask = new JokeAsyncTask(this);
        jokeAsyncTask.execute();

        mSignal.await();

        assertFalse(TextUtils.isEmpty(mResultString));
    }

    @Override
    public void onTaskCompleted(String result)
    {
        mResultString = result;
        mSignal.countDown();
    }
}