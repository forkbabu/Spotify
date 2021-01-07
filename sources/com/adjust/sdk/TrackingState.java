package com.adjust.sdk;

public enum TrackingState {
    OPTED_OUT(1);
    
    private int value;

    private TrackingState(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
