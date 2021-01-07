package com.spotify.podcastsegments.proto;

import com.google.protobuf.o;

public enum SegmentType implements o.c {
    UNKNOWN(0),
    TALK(1),
    MUSIC(2),
    UPSELL(3),
    UNRECOGNIZED(-1);
    
    private final int value;

    private SegmentType(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
