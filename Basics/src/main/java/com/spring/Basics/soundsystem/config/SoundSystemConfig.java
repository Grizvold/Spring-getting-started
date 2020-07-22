package com.spring.Basics.soundsystem.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@Import({CDPlayerConfig.class, CDConfig.class, AspectConfig.class})
@EnableAspectJAutoProxy
//@ImportResource("classpath:cdplayer_config.xml")
public class SoundSystemConfig {
}
