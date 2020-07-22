package com.spring.Basics.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("deepHouse")
@PropertySource("application.properties")
public class DeepHouseHolder implements CompactDisc {
//    @Value("${DeepHouseHolder.title}")
    @Value("#{systemProperties['DeepHouseHolder.title']}")
    private String title;
//    @Value("${DeepHouseHolder.artist}")
    @Value("#{systemProperties['DeepHouseHolder.artist']}")
    private String artist;

    @Autowired
    Environment environment;

//    public DeepHouseHolder() {
////        title = environment.getRequiredProperty("deepHouse.title");
////        artist = environment.getRequiredProperty("deepHouse.artist");
//
//        title = "random";
//        artist = "artist";
//    }

//    public DeepHouseHolder(@Value("${DeepHouseHolder.title}") String title,
//                           @Value("${DeepHouseHolder.artist}") String artist) {
//        this.title = title;
//        this.artist = artist;
//    }

    public boolean isEnvironmentExists() {
        boolean isContains = environment.containsProperty("deepHouse.title");
        return isContains;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    @Override
    public void playTrack(int track) {

    }
}
