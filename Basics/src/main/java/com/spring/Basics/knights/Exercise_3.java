package com.spring.Basics.knights;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.*;

public class Exercise_3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Map<String, Knight> context_knights = context.getBeansOfType(Knight.class);

//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("knights.xml"));
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(factory);
        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("knights.xml"));
        Map<String, Knight> factory_knights = factory.getBeansOfType(Knight.class);

        Knight context_knight_1 = context.getBean(Knight.class);
        Knight context_knight_2 = context.getBean(Knight.class);
        Knight context_knight_3 = context.getBean(Knight.class);
        Set<Integer> context_hashcode_set = new HashSet<>();
        Collections.addAll(context_hashcode_set,
                            context_knight_1.hashCode(),
                            context_knight_2.hashCode(),
                            context_knight_3.hashCode());

        Knight factory_knight_1 = factory.getBean(Knight.class);
        Knight factory_knight_2 = factory.getBean(Knight.class);
        Knight factory_knight_3 = factory.getBean(Knight.class);
        Set<Integer> factory_hashcode_set = new HashSet<>();
        Collections.addAll(factory_hashcode_set,
                factory_knight_1.hashCode(),
                factory_knight_2.hashCode(),
                factory_knight_3.hashCode());

        System.out.println("Definitions of Application context: " + Arrays.asList(context.getBeanDefinitionNames()));
        System.out.println("Definitions of Factory context: " + Arrays.asList(factory.getBeanDefinitionNames()));
        System.out.println("Size of contextapp Set : " + context_hashcode_set.size() +
                            ". Values of context Set: " + Arrays.toString(context_hashcode_set.toArray()));
        System.out.println("Size of factory Set : " + factory_hashcode_set.size() +
                            ". Values of factory Set: " + Arrays.toString(factory_hashcode_set.toArray()));
    }
}
