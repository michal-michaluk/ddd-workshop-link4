package io.dddbyexamples.delivery.planning.delivery;

public class EditDelivery {
    private final Payload payload;
    private final Transport transport;

    public EditDelivery(Payload payload, Transport transport) {
        this.payload = payload;
        this.transport = transport;
    }

    public Payload getPayload() {
        return payload;
    }

    public Transport getTransport() {
        return transport;
    }
}
