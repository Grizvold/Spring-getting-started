package com.spring.Basics.knights;

import org.springframework.stereotype.Component;

@Component
public class RescueDamselQuest implements Quest{
    @Override
    public void embark() {
        System.out.println("Embarking on quest to rescue damsel!");
    }
}
