package io.dddbyexamples.delivery.planning;

import io.dddbyexamples.delivery.planning.delivery.DeliveryPlanChanged;
import io.dddbyexamples.delivery.planning.delivery.PlanningEvents;

public class PlanningEventsPropagation implements PlanningEvents {

    private DeliveryPlanForDay planProjection;

    @Override
    public void emit(DeliveryPlanChanged event) {
        planProjection.apply(event);
    }
}
