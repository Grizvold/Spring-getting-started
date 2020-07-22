package com.spring.Basics.texteditor.config;

import com.spring.Basics.texteditor.SpellChecker;
import com.spring.Basics.texteditor.TextEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor() {
        return new TextEditor(spellChecker());
    }

    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }
}
