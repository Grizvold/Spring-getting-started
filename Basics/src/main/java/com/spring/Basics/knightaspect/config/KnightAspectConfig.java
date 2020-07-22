package com.spring.Basics.knightaspect.config;

import com.spring.Basics.knightaspect.KnightAfterAspect;
import com.spring.Basics.knightaspect.KnightAroundAspect;
import com.spring.Basics.knightaspect.KnightBeforeAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightAspectConfig {
    @Bean
    public KnightBeforeAspect knightBeforeAspect() {
        return new KnightBeforeAspect();
    }

    @Bean
    public KnightAfterAspect knightAfterAspect() {
        return new KnightAfterAspect();
    }

    @Bean
    public KnightAroundAspect knightAroundAspect() {
        return new KnightAroundAspect();
    }
}
