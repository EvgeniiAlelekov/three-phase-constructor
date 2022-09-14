package com.example.terminator.quoters;

import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class PropertyFileApplicationContext extends GenericApplicationContext {
    public PropertyFileApplicationContext(String file1name) {
        PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(this);
        int i = reader.loadBeanDefinitions(file1name);
        System.out.println("found "+i+" beans");
        refresh();
    }

    public static void main(String[] args) {
        PropertyFileApplicationContext context = new PropertyFileApplicationContext("context.properties");
        context.getBean(Quoter.class).sayQuote();
    }
}
