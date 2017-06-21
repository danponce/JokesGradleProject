package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.databinding.ObservableBoolean;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.creativeprojects.android.jokeactivity.JokeActivity;


public class MainActivity extends AppCompatActivity implements TaskCompleted
{
    public final ObservableBoolean mBindVisibility = new ObservableBoolean();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {

        // Show the loading progress bar with binding
        mBindVisibility.set(true);

        // Get Joke from endpoint
        new JokeAsyncTask(this).execute(this);
    }

    @Override
    public void onTaskCompleted(String result)
    {
        Intent intent = new Intent(this, JokeActivity.class);

        intent.putExtra(JokeActivity.JOKE_KEY, result);

        startActivity(intent);

        // Hide the loading progress bar with binding
        mBindVisibility.set(false);
    }
}
