package com.spotify.mobile.android.video.drm;

public enum EncryptionType {
    WIDEVINE("widevine"),
    NONE("none"),
    UNKNOWN("unknown");
    
    private final String mLiteral;

    private EncryptionType(String str) {
        this.mLiteral = str;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.mLiteral;
    }
}
