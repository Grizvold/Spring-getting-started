package com.spring.Basics.knightaspect.config;

import com.spring.Basics.knightaspect.KnightAfterAspect;
import com.spring.Basics.knightaspect.KnightBeforeAspect;
import com.spring.Basics.knights.*;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@Import(KnightAspectConfig.class)
public class KnightConfig {
    @Bean(name = "braveKnight")
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
}
