package io.dddbyexamples.delivery.planning.delivery;

public interface PlanningEvents {
    void emit(DeliveryPlanChanged event);
}
