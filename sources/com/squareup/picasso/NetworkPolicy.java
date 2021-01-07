package com.squareup.picasso;

public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    final int index;

    private NetworkPolicy(int i) {
        this.index = i;
    }

    public static boolean d(int i) {
        return (i & OFFLINE.index) != 0;
    }
}
