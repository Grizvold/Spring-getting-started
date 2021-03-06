package com.spring.Basics.knights;

import org.springframework.stereotype.Component;

@Component
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    //Tightly coupled to RescueDamselQuest
    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
