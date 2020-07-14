package com.spring.Basics.knightaspect;

import com.spring.Basics.knights.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Minstrel minstrel() {
        return new Minstrel(System.out);
    }

    @Bean
    public KnightBeforeAspect knightBeforeAspect() {
        return new KnightBeforeAspect();
    }

    @Bean
    public KnightAfterAspect knightAfterAspect() {
        return new KnightAfterAspect();
    }
}
