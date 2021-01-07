package com.spotify.playlist.proto;

import com.google.protobuf.o;

public enum OnDemandInFreeReason implements o.c {
    UNKNOWN(0),
    NOT_ON_DEMAND(1),
    ON_DEMAND(2),
    ON_DEMAND_EPISODES_ONLY(3);
    
    private final int value;

    private OnDemandInFreeReason(int i) {
        this.value = i;
    }

    public static OnDemandInFreeReason d(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NOT_ON_DEMAND;
        }
        if (i == 2) {
            return ON_DEMAND;
        }
        if (i != 3) {
            return null;
        }
        return ON_DEMAND_EPISODES_ONLY;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
