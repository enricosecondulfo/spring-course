package it.learning.spring.core.annotation;


public class Mailbox {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void destroy() {
        System.out.println("destroy");

    }
}
