package com.spring.Basics.knights;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();

        Quest slayDragonQuest = new SlayDragonQuest(System.out);
        knight.setQuest(slayDragonQuest);
        knight.embarkOnQuest();

        Quest saveDamsel = new RescueDamselQuest();
        knight.setQuest(saveDamsel);
        knight.embarkOnQuest();
    }
}