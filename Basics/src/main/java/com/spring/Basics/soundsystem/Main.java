package com.spring.Basics.soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext contextXML = new ClassPathXmlApplicationContext("cdplayer_config.xml");
        ClassPathXmlApplicationContext contextXML = new ClassPathXmlApplicationContext("soundsystem_config.xml");

        CompactDisc blank_cd = (CompactDisc) contextXML.getBean("compactDisc", BlankDisc.class);
        System.out.println("\nPlaying blank disc");
        blank_cd.play();

        CompactDisc beatles_cd = (CompactDisc) contextXML.getBean("beatlesDisc", SgtPeppers.class);
        System.out.println("\nPlaying Beatles disc");
        beatles_cd.play();

        CDPlayer player = (CDPlayer) contextXML.getBean("cdPlayer");
        System.out.println("\nStarting cd player with blank disc");
        player.play();
        player.setCd(beatles_cd);
        System.out.println("\nChanging disc to Beatles");
        player.play();
        System.out.println("\nPutting blank disc back");
        player.setCd(blank_cd);
        player.play();

        contextXML.close();
    }

}
