package com.spring.Basics.soundsystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({CDPlayerConfig.class, CDConfig.class})
//@ImportResource("classpath:cdplayer_config.xml")
public class SoundSystemConfig {
}
