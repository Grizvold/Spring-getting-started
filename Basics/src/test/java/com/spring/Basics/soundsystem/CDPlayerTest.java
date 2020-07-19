package com.spring.Basics.soundsystem;

import com.spring.Basics.soundsystem.config.CDConfig;
import com.spring.Basics.soundsystem.config.CDPlayerConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;
import org.junit.contrib.java.lang.system.SystemOutRule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer mediaPlayer;

    //injects CompactDisc to the test
    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        System.out.println(cd);
        assertNotNull(cd);
    }

    @Test
    public void play() {
        mediaPlayer.play();
        assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band" + " by The Beatles\n",
                log.getLog());
    }
}