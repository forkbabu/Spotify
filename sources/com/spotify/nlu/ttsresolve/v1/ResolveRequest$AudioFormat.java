package com.spotify.nlu.ttsresolve.v1;

import com.google.protobuf.o;

public enum ResolveRequest$AudioFormat implements o.c {
    UNSPECIFIED(0),
    WAV(1),
    PCM(2),
    OPUS(3),
    VORBIS(4),
    MP3(5),
    UNRECOGNIZED(-1);
    
    private final int value;

    private ResolveRequest$AudioFormat(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
