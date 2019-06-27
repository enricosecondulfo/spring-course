package it.learning.spring.core.beanlife;

public class Message {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("Init stage");
    }

    public void destroy() {
        System.out.println("Destroy stage");
    }

    @Override
    public String toString() {
        return message;
    }
}
