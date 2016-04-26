package com.example;

import java.util.ArrayList;

public class MyClass {
    ArrayList<String> jokes ;
    public MyClass(){
        jokes = new ArrayList<>();
        for(int i=0;i<100;i++){
            jokes.add("joke #"+String.valueOf(i+1));
        }
    }

    public ArrayList<String> getJokes() {
        return jokes;
    }

    public String getRandomJoke(){
        return jokes.get((int) Math.ceil(Math.random() * 100));
    }

    public void setJokes(ArrayList<String> jokes) {
        this.jokes = jokes;
    }
}
