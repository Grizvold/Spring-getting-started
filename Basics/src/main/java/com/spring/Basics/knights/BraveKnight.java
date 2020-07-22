package com.spring.Basics.knights;

import org.springframework.stereotype.Component;

@Component
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        System.out.println("BraveKnight embarking on quest");
        quest.embark();
    }
}
