package com.spotify.audiorecord.api;

public class AudioRecordingException extends RuntimeException {
    private static final long serialVersionUID = 4777350721298145767L;
    private final String mErrorType;

    public AudioRecordingException(String str, Throwable th) {
        super(th);
        this.mErrorType = str;
    }

    public String a() {
        return this.mErrorType;
    }
}
