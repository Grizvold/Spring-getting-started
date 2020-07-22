package com.spring.Basics.knights;

import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Component
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Fa la la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight " + "did embark on a quest");
    }
}
