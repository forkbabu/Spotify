package com.spotify.instrumentation;

public enum InteractionType {
    LONG_PRESS("long-press"),
    TAP("tap"),
    UNKNOWN("unknown");
    
    private final String mInteractionType;

    private InteractionType(String str) {
        this.mInteractionType = str;
    }

    public String d() {
        return this.mInteractionType;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return je.I0(je.V0("{interactionType='"), this.mInteractionType, "'}");
    }
}
