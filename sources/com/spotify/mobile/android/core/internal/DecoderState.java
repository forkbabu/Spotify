package com.spotify.mobile.android.core.internal;

public enum DecoderState {
    CONTINUE(0),
    ABORTED(-1),
    END_OF_STREAM(-2),
    ERROR(-3);
    
    private final int value;

    private DecoderState(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
