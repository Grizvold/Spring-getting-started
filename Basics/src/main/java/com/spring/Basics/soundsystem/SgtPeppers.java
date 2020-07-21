package com.spring.Basics.soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("sgtPeppers")
public class SgtPeppers implements  CompactDisc{

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
            System.out.println("Playing " + title + " by " + artist);
    }
}