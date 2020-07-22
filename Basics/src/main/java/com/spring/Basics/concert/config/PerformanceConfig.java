package com.spring.Basics.concert.config;

import com.spring.Basics.concert.Performance;
import com.spring.Basics.concert.ZHUPerformance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PerformanceConfig {
    @Bean(name = "zhuPerformance")
    public Performance zhuPerformance() {
        return new ZHUPerformance();
    }
}
