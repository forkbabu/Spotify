package com.spotify.podcastinteractivity.qna.model.proto;

import com.google.protobuf.o;

public enum QAndAStatus implements o.c {
    DRAFT(0),
    SCHEDULED(1),
    LIVE(2),
    CLOSED(3),
    DELETED(4),
    UNRECOGNIZED(-1);
    
    private final int value;

    private QAndAStatus(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
