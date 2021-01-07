package com.spotify.music.podcastinteractivity.proto;

import com.google.protobuf.o;

public enum PollStatus implements o.c {
    DRAFT(0),
    SCHEDULED(1),
    LIVE(2),
    CLOSED(3),
    UNRECOGNIZED(-1);
    
    private final int value;

    private PollStatus(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
