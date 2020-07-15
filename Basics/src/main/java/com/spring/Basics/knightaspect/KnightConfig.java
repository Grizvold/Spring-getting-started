package com.spring.Basics.knightaspect;

import com.spring.Basics.knights.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class KnightConfig {
    @Bean(name = "knight")
    @Scope(value = "prototype")
    public Knight knight()   {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

    @Bean(name = "damsel")
    public RescueDamselQuest rescueDamselQuest() {
        return new RescueDamselQuest();
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
