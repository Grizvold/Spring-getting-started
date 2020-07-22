package com.spring.Basics.texteditor;

import com.spring.Basics.texteditor.config.TextEditorConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor textEditor = applicationContext.getBean(TextEditor.class);
        textEditor.spellCheck();
    }
}
