package com.spring.Basics.knights;

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
