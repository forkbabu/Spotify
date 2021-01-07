package com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips;

public enum Order {
    First(new int[]{16842916}),
    Middle(new int[]{16842917}),
    Last(new int[]{16842918});
    
    private final int[] state;

    private Order(int[] iArr) {
        this.state = iArr;
    }

    public final int[] getState() {
        return this.state;
    }
}
