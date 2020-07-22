package com.spring.Basics.knightaspect;

import com.spring.Basics.knightaspect.config.KnightConfig;
import com.spring.Basics.knights.Knight;
import com.spring.Basics.soundsystem.config.SoundSystemConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = KnightConfig.class)
public class KnightAspectTest {

    @Autowired
    private Knight braveKnight;

    @Test
    public void knightTest() {
        assertNotNull(braveKnight);
        braveKnight.embarkOnQuest();
    }
}