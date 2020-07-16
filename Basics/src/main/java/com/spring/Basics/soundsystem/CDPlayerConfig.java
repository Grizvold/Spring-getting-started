package com.spring.Basics.soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConfig {
    //    private static ApplicationContext applicationContext;
//
//    public static void main(String[] args) {
//        applicationContext = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
//
//        for (String beanName : applicationContext.getBeanDefinitionNames()) {
//            System.out.println(beanName);
//        }
//    }
    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}
