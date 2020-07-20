package com.spring.Basics.soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contextXML = new ClassPathXmlApplicationContext("cdplayer_config.xml");

        CompactDisc blank_cd = (CompactDisc) contextXML.getBean("compactDisc", BlankDisc.class);
        blank_cd.play();

        CompactDisc beatles_cd = (CompactDisc) contextXML.getBean("compactDisc", SgtPeppers.class);

        CDPlayer player = (CDPlayer) contextXML.getBean("cdPlayer");
        player.play();
        player.setCd(blank_cd);
        player.play();
        player.setCd(beatles_cd);
        player.play();

        contextXML.close();
    }

}
