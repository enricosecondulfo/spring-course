package it.learning.spring.core.ditypes;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String... args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Message setterMessage = (Message) context.getBean("setterMessage");
        Message constructorMessage = (Message) context.getBean("constructorMessage");
        Message indexMessage = (Message) context.getBean("indexMessage");

        System.out.println(setterMessage);
        System.out.println(constructorMessage);
        System.out.println(indexMessage);
    }
}
