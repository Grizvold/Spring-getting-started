package com.spring.Basics.soundsystem.config;

import com.spring.Basics.soundsystem.aspects.TrackCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {
    @Bean
    public TrackCounter trackCounterAspect() {
        return new TrackCounter();
    }
}
