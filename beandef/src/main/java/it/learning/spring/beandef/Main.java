package it.learning.spring.beandef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MailBox mailbox = (MailBox) context.getBean("mailbox");

        Envelope envelop = (Envelope)context.getBean("envelope");

       // System.out.println(mailbox);
        System.out.println(envelop);
    }
}
