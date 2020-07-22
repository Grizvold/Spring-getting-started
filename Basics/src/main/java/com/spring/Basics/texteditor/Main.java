package com.spring.Basics.texteditor;

import com.spring.Basics.texteditor.config.TextEditorConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TextEditorConfig.class)
public class Main {

    @Autowired
    private TextEditor textEditor;

    @Test
    public void testEditor() {
        assertNotNull(textEditor);
        textEditor.spellCheck();
    }
}
