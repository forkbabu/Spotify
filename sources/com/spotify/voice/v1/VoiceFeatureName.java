package com.spotify.voice.v1;

import com.google.protobuf.o;

public enum VoiceFeatureName implements o.c {
    UNKNOWN(0),
    IOS_MOBILE_VOICE(1),
    ANDROID_MOBILE_VOICE(2),
    IOS_SIRI(3),
    GOOGLE_HOME(4),
    CAR_THING(5),
    GOOGLE_ASSISTANT(6),
    ANDROID_AUTO(7),
    ANDROID_CAR_VIEW(8),
    IOS_VOICE_ADS(9),
    ANDROID_VOICE_ADS(10),
    HOME_THING(11),
    ALEXA_MSK(12),
    SAMSUNG_BIXBY(13),
    CORTANA(14),
    SONOS_GOOGLE_ASSISTANT(15),
    IOS_CAR_VIEW(16),
    WATCHOS_SIRI(17),
    CERBERUS(18),
    ANDROID_GOOGLE_ASSISTANT(19),
    IOS_GOOGLE_ASSISTANT(20),
    ANDROID_ALEXA(21),
    IOS_ALEXA(22),
    CAR_THING_NEXT_GEN(23),
    ALTERNATIVE_SEARCH_NO_PLAYBACK(24),
    STATIONS_ANDROID(25),
    UNRECOGNIZED(-1);
    
    private final int value;

    private VoiceFeatureName(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
