package com.spring.Basics.soundsystem.config;

import com.spring.Basics.soundsystem.CDPlayer;
import com.spring.Basics.soundsystem.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig {
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        CDPlayer cdPlayer = new CDPlayer(compactDisc);
        cdPlayer.setCd(compactDisc);
        return cdPlayer;
    }
}
