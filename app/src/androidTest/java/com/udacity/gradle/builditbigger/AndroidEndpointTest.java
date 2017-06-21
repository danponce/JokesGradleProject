package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AndroidEndpointTest implements TaskCompleted
{
    @Test
    public void testAsyncTaskResult() throws Exception
    {
        JokeAsyncTask jokeAsyncTask = new JokeAsyncTask(this);
        jokeAsyncTask.execute();
    }

    @Override
    public void onTaskCompleted(String result)
    {
        assertNotNull(result.isEmpty());
    }
}