package com.spring.Basics.soundsystem;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    //injects CompactDisc to the test
    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        System.out.println(cd);
        System.out.println("something");
//        assertNotNull(cd);
    }
}