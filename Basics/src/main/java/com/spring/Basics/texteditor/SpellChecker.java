package com.spring.Basics.texteditor;

import org.springframework.stereotype.Component;

@Component
public class SpellChecker {

    public SpellChecker() {
        System.out.println("SpellChecker ctor");
    }

    public void checkSpelling() {
        System.out.println("Doing spell checking");
    }
}
