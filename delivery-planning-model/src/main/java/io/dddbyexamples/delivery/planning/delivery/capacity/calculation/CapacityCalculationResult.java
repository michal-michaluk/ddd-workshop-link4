package io.dddbyexamples.delivery.planning.delivery.capacity.calculation;

import java.util.Optional;

public class CapacityCalculationResult {
    private final boolean exceeded;
    private final Suggestion suggestion;

    public CapacityCalculationResult(boolean exceeded, Suggestion suggestion) {
        this.exceeded = exceeded;
        this.suggestion = suggestion;
    }

    public boolean isExceeded() {
        return exceeded;
    }

    public Optional<Suggestion> getSuggestion() {
        return Optional.ofNullable(suggestion);
    }

}
