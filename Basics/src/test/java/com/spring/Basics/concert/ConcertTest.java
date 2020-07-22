package com.spring.Basics.concert;

import com.spring.Basics.concert.config.ConcertConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertTest {
    @Autowired
    Performance zhuPerformance;

    @Test
    public void shouldNotBeNull() {
        assertNotNull(zhuPerformance);
        zhuPerformance.perform();
    }
}