package io.dddbyexamples.delivery.planning.delivery.capacity.calculation;

import io.dddbyexamples.delivery.planning.delivery.TransportType;

import java.util.List;

public class Suggestion {
    private final List<TransportType> suggestedTransportType;
    private final StorageUnitsAmounts exceededAmounts;

    public Suggestion(List<TransportType> suggestedTransportType, StorageUnitsAmounts exceededAmounts) {
        this.suggestedTransportType = suggestedTransportType;
        this.exceededAmounts = exceededAmounts;
    }
}
