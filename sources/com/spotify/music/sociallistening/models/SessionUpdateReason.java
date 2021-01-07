package com.spotify.music.sociallistening.models;

public enum SessionUpdateReason {
    UNKNOWN_UPDATE_TYPE("UNKNOWN_UPDATE_TYPE"),
    NEW_SESSION("NEW_SESSION"),
    USER_JOINED("USER_JOINED"),
    USER_LEFT("USER_LEFT"),
    SESSION_DELETED("SESSION_DELETED"),
    YOU_LEFT("YOU_LEFT"),
    YOU_WERE_KICKED("YOU_WERE_KICKED"),
    YOU_JOINED("YOU_JOINED");
    
    private final String type;

    private SessionUpdateReason(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.type;
    }
}
