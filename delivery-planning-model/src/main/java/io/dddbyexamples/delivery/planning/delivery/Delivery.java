package io.dddbyexamples.delivery.planning.delivery;

import io.dddbyexamples.delivery.planning.delivery.capacity.calculation.PayloadCapacityPolicy;
import io.dddbyexamples.delivery.planning.delivery.capacity.calculation.StorageUnitsAmounts;
import io.dddbyexamples.delivery.planning.delivery.capacity.calculation.Suggestion;

import java.util.Optional;

public class Delivery {

    private Transport transport;
    private Payload payload;
    private PlanningEvents events;
    private PayloadCapacityPolicy policy;

    public Delivery(PlanningEvents events) {
        this.events = events;
    }

    public Optional<Suggestion> edit(EditDelivery command) {
        StorageUnitsAmounts storageUnitsAmounts = command.getPayload().getStorageUnitAmounts();

        var capacity = policy.calculate(
                command.getTransport().getType(),
                storageUnitsAmounts
        );

        if (capacity.isExceeded()) {
            return capacity.getSuggestion();
        }
        transport = command.getTransport();
        payload = command.getPayload();

        DeliveryPlanChanged event = new DeliveryPlanChanged();
        events.emit(event);

        return Optional.empty();
    }

    public void cancel(CancelDelivery command) {


        DeliveryPlanChanged event = new DeliveryPlanChanged();
        events.emit(event);
    }

}
