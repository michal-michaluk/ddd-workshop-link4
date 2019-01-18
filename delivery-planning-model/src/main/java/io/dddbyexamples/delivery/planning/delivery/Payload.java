package io.dddbyexamples.delivery.planning.delivery;

import io.dddbyexamples.delivery.planning.delivery.capacity.calculation.StorageUnitsAmounts;

public class Payload {
    public StorageUnitsAmounts getStorageUnitAmounts() {
        return new StorageUnitsAmounts();
    }
}
