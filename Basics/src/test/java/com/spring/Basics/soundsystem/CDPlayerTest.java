package com.spring.Basics.soundsystem;

import com.spring.Basics.soundsystem.aspects.TrackCounter;
import com.spring.Basics.soundsystem.config.CDConfig;
import com.spring.Basics.soundsystem.config.CDPlayerConfig;
import com.spring.Basics.soundsystem.config.SoundSystemConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;
import org.junit.contrib.java.lang.system.SystemOutRule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
@ActiveProfiles("dev")
public class CDPlayerTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private TrackCounter trackCounter;

    @Autowired
    private MediaPlayer mediaPlayer;

    //injects CompactDisc to the test
    @Autowired
    @Qualifier("blankDisc")
    private CompactDisc blankDisc;
    @Autowired
    @Qualifier("blankDisc")
    private CompactDisc blankDisc2;

    @Autowired
//    @Qualifier("lonelyHeartsClubBand")
    private CompactDisc cd_1;
    @Autowired
    private CompactDisc cd_2;

    @Autowired
    @Qualifier("deepHouse")
    private CompactDisc deepHouseCD;

    @Test
    public void trackCounter() {
        assertNotNull(trackCounter);
        cd_1.playTrack(1);
        cd_1.playTrack(2);
        cd_1.playTrack(3);
        cd_1.playTrack(3);
        cd_1.playTrack(3);
        cd_1.playTrack(3);
        cd_1.playTrack(7);
        cd_1.playTrack(7);  

        assertEquals(1, trackCounter.getPlayCount(1));
        assertEquals(1, trackCounter.getPlayCount(2));
        assertEquals(4, trackCounter.getPlayCount(3));
        assertEquals(0, trackCounter.getPlayCount(4));
        assertEquals(0, trackCounter.getPlayCount(5));
        assertEquals(0, trackCounter.getPlayCount(6));
        assertEquals(2, trackCounter.getPlayCount(7));
    }

    @Test
    public void cdShouldNotBeNull() {
        System.out.println("Should be blankDisc");
        System.out.println(blankDisc);
        assertNotNull(blankDisc);
        blankDisc.play();
    }

    @Test
    public void cdShouldNotBeNull_2() {
        System.out.println("\nShould be primary - sgtPeppersDisc");
        System.out.println(cd_1);
        assertNotNull(cd_1);
        cd_1.play();
    }

    @Test
    public void placeHolderTest() {
        System.out.println("\nShould be Deep House");
        System.out.println(deepHouseCD);
        assertNotNull(deepHouseCD);
        deepHouseCD.play();
    }

    @Test
    public void instanceTest() {
        System.out.println(cd_1 instanceof SgtPeppers);
        System.out.println(cd_2 instanceof SgtPeppers);

        assertEquals(false, cd_1.hashCode() == cd_2.hashCode());

        System.out.println(blankDisc instanceof BlankDisc);
        assertEquals(true, blankDisc.hashCode() == blankDisc2.hashCode());
    }

    @Test
    public void playSystemOut() {
        String title = "Sgt. Pepper's Lonely Hearts Club Band";
        String artist = "The Beatles";

        mediaPlayer.play();
        systemOutRule.clearLog();
        System.out.print("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles");
        assertEquals("Playing " + title + " by " + artist, systemOutRule.getLog());
    }
}