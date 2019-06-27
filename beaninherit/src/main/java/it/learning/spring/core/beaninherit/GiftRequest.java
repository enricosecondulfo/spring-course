package it.learning.spring.core.beaninherit;

public class GiftRequest {

    private String source;
    private String destination;
    private String reason;

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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "GiftRequest{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
