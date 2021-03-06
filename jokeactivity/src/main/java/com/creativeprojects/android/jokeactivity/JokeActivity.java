package com.creativeprojects.android.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity
{
    public static final String JOKE_KEY = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Bundle extras = getIntent().getExtras();

        if(extras != null)
        {
            TextView jokeTextView = (TextView) findViewById(R.id.joke_textview);

            String joke = extras.getString(JOKE_KEY);

            jokeTextView.setText(joke);
        }
    }
}
