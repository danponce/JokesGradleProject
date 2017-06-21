package com.udacity.gradle.builditbigger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class EndpointTest implements TaskCompleted
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