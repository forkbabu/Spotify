package com.spotify.podcastinteractivity.qna.model.proto;

import com.google.protobuf.o;

public enum EducationStatus implements o.c {
    DEFAULT(0),
    INCOMPLETE(1),
    COMPLETE(2),
    UNRECOGNIZED(-1);
    
    private final int value;

    private EducationStatus(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
