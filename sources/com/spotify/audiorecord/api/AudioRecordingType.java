package com.spotify.audiorecord.api;

public enum AudioRecordingType {
    MICROPHONE("mic"),
    EXTERNAL("external");
    
    private final String mType;

    private AudioRecordingType(String str) {
        this.mType = str;
    }
}
