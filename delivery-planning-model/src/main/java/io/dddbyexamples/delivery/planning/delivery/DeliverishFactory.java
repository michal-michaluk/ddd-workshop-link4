package io.dddbyexamples.delivery.planning.delivery;

import io.dddbyexamples.delivery.planning.PlanningEventsPropagation;

public class DeliverishFactory {

    PlanningEvents events = new PlanningEventsPropagation();

    public Delivery scheduleDelivery(SheduleDelivery command) {
        return new Delivery(events);
    }
}
