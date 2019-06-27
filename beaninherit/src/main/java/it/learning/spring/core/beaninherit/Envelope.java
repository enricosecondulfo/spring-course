package it.learning.spring.core.beaninherit;

public class Envelope {

    private String source;
    private String destination;
    private String message;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Envelope{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
