package com.spotify.voice.v1;

import com.google.protobuf.o;

public enum VoiceInteractionManagerFeature implements o.c {
    UNKNOWN_FEATURE(0),
    ACCESSIBILITY_SERVICES(1),
    CAR_MODE(2),
    TTS(4),
    GUESSING_DIALOG(3),
    FAVORITES_DIALOG(5),
    UMM_DIALOG(6),
    LOCALHOST(7),
    INTRODUCER(8),
    RECOMMEND(9),
    PLAY_SOMETHING_DIALOG(10),
    UNRECOGNIZED(-1);
    
    private final int value;

    private VoiceInteractionManagerFeature(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
