package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jokes
{
    public String getJoke()
    {
        String joke1 = "Control Freak\n" +
                "Knock! Knock!\n" +
                "Who’s there?\n" +
                "Control Freak.\n" +
                "Con—\n" +
                "Okay, now you say, “Control Freak who?";

        String joke2 = "Knock! Knock!\n" +
                "Who’s there?\n" +
                "Impatient cow.\n" +
                "Impatient co…\n" +
                "MOO!";

        String joke3 = "Knock! Knock!\n" +
                "Who’s there?\n" +
                "Wanda\n" +
                "Wanda who?\n" +
                "Wanda hang out with me right now?";

        String joke4 = "Knock! Knock!\n" +
                "Who’s there?\n" +
                "Olive.\n" +
                "Olive who?\n" +
                "Olive you and I don’t care who knows it!";

        List<String> jokeList = new ArrayList<>();
        jokeList.add(joke1);
        jokeList.add(joke2);
        jokeList.add(joke3);
        jokeList.add(joke4);

        Random random = new Random();

        int randomJokePosition = random.nextInt(jokeList.size());

        return jokeList.get(randomJokePosition);
    }
}
