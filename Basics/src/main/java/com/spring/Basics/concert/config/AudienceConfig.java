package com.spring.Basics.concert.config;

import com.spring.Basics.concert.Audience;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AudienceConfig {
    @Bean(name = "audience")
    public Audience audience() {
        return new Audience();
    }
}
