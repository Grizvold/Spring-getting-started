package com.spring.Basics.soundsystem.config;

import com.spring.Basics.soundsystem.CDPlayer;
import com.spring.Basics.soundsystem.CompactDisc;
import com.spring.Basics.soundsystem.MediaPlayer;
import com.spring.Basics.soundsystem.SgtPeppers;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//not type safe since its passed as String so in case of refactor it will be error
//@ComponentScan(basePackages = "com.spring.Basics.soundsystem")
//@ComponentScan(basePackageClasses = {SgtPeppers.class, CDPlayer.class})
//@Component("cdConfig")
public class CDConfig {
//    private static ApplicationContext applicationContext;
//
//    public static void main(String[] args) {
//        applicationContext = new AnnotationConfigApplicationContext(CDConfig.class);
//
//        for (String beanName : applicationContext.getBeanDefinitionNames()) {
//            System.out.println(beanName);
//        }
//    }
    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}
