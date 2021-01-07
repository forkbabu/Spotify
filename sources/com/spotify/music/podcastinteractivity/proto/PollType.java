package com.spotify.music.podcastinteractivity.proto;

import com.google.protobuf.o;

public enum PollType implements o.c {
    MULTIPLE_CHOICE(0),
    SINGLE_CHOICE(1),
    UNRECOGNIZED(-1);
    
    private final int value;

    private PollType(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
