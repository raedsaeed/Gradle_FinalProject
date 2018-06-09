package com.example.jokelibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joker {
    List<String> jokes = new ArrayList<>();
    public Joker () {
        String joke = "A foo walks into a bar, takes around look and says \"Hello World\"";
        jokes.add(joke);
        joke = "Chuck Norris can take a screenshot of his blue device";
        jokes.add(joke);
        joke = "Real programmers count from 0";
        jokes.add(joke);
        joke = "\"Inheritance\" is the object oriented way to become wealthy";
        jokes.add(joke);
    }
    public String getJoke () {
        Random random = new Random();
        return jokes.get(random.nextInt(jokes.size()));
    }
}
