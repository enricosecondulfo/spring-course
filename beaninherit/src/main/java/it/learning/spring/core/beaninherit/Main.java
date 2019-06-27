package it.learning.spring.core.beaninherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Envelope envelope1 = (Envelope) context.getBean("envelope1");
        Envelope envelope2 = (Envelope) context.getBean("envelope2");
        GiftRequest request = (GiftRequest) context.getBean("gift");

        System.out.println(envelope1);
        System.out.println(envelope2);
        System.out.println(request);
    }
}
