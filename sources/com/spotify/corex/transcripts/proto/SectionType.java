package com.spotify.corex.transcripts.proto;

import com.google.protobuf.o;

public enum SectionType implements o.c {
    UNKNOWN(0),
    PLAINTEXT_CONTENT(1),
    UNRECOGNIZED(-1);
    
    private final int value;

    private SectionType(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
