package com.spring.Basics.concert.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@Import({AudienceConfig.class, PerformanceConfig.class})
public class ConcertConfig {
}
