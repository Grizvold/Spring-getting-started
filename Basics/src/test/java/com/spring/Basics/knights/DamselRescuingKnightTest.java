package com.spring.Basics.knights;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DamselRescuingKnightTest {
    @Test
    public void damselRescuingKnight() {
        DamselRescuingKnight knight = new DamselRescuingKnight();
        knight.embarkOnQuest(); //tightly coupled
    }
}