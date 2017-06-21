package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jokes
{
    public String getJoke()
    {
        String joke1 = "Control Freak\n" +
                "\n" +
                "Knock! Knock!\n" +
                "\n" +
                "Who’s there?\n" +
                "\n" +
                "Control Freak.\n" +
                "\n" +
                "Con—\n" +
                "\n" +
                "Okay, now you say, “Control Freak who?”";

        String joke2 = "Knock! Knock!\n" +
                "\n" +
                "Who’s there?\n" +
                "\n" +
                "Impatient cow.\n" +
                "\n" +
                "Impatient co…\n" +
                "\n" +
                "MOO!";

        String joke3 = "Knock! Knock!\n" +
                "Who’s there?\n" +
                "Wanda\n" +
                "Wanda who?\n" +
                "Wanda hang out with me right now?";

        String joke4 = "Knock! Knock!\n" +
                "\n" +
                "Who’s there?\n" +
                "\n" +
                "Olive.\n" +
                "\n" +
                "Olive who?\n" +
                "\n" +
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
