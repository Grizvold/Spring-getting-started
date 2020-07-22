package com.spring.Basics.soundsystem.config;

import com.spring.Basics.soundsystem.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
//not type safe since its passed as String so in case of refactor it will be error
//@ComponentScan(basePackages = "com.spring.Basics.soundsystem")
//@ComponentScan(basePackageClasses = {SgtPeppers.class, CDPlayer.class})
//@Component("cdConfig")
public class CDConfig {
    //    private static ApplicationContext applicationContext;
//
//    public static void main(String[] args) {
//        applicationContext = new AnnotationConfigApplicationContext(CDConfig.class);
//
//        for (String beanName : applicationContext.getBeanDefinitionNames()) {
//            System.out.println(beanName);
//        }
//    }

    @Profile("dev")
    @Primary
//    @Qualifier("lonelyHeartsClubBand")
    @Bean(name = "lonelyHeartsClubBand")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CompactDisc sgtPeppers() {
        BlankDisc blankDisc = new BlankDisc();
        blankDisc.setArtist("Sgt. Pepper's Lonely Hearts Club Band");
        blankDisc.setTitle("The Beatles");
        List<String> tracks = new ArrayList<>();
        tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
        tracks.add("With a Little Help from My Friends");
        tracks.add("Lucy in the Sky with Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a Hole");
        blankDisc.setTracks(tracks);
        return blankDisc;
    }

    @Profile("dev")
    @Qualifier("blankDisc")
    @Bean(name = "blankDisc")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Conditional(BlankDiscCondition.class)
    public CompactDisc blankDisc() {
        String title = "Feeling Good";
        String artist = "ZHU";
        List<String> tracks = new ArrayList<>();

        tracks.add("Faded");
        tracks.add("Automatic");
        tracks.add("Working For It");
        tracks.add("Generationwhy");
        tracks.add("Hometown Girl");
        tracks.add("Nightcrawler");
        tracks.add("Intoxicate");

        return new BlankDisc(title, artist, tracks);
    }

    @Profile("dev")
    @Qualifier("deepHouse")
    @Bean(name = "deepHouse")
    public CompactDisc deepHouse() {
        return new DeepHouseHolder();
    }
}
