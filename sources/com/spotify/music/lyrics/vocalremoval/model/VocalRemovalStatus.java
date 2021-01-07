package com.spotify.music.lyrics.vocalremoval.model;

public enum VocalRemovalStatus {
    ENABLED("enabled"),
    DISABLED("disabled");
    
    private final String mStatus;

    private VocalRemovalStatus(String str) {
        this.mStatus = str;
    }

    public String d() {
        return this.mStatus;
    }

    public boolean g() {
        return this.mStatus.equals(ENABLED.mStatus);
    }

    public VocalRemovalStatus h() {
        String str = this.mStatus;
        VocalRemovalStatus vocalRemovalStatus = DISABLED;
        return str.equals(vocalRemovalStatus.mStatus) ? ENABLED : vocalRemovalStatus;
    }
}
