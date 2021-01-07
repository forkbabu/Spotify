package com.spotify.music.features.premiumdestination.debug;

public enum PremiumPageEnvironment {
    PROD("Production", "premium-destination-hubs"),
    DEV("Development", "premium-destination-hubs-dev"),
    STAGING("Staging", "premium-destination-hubs-staging");
    
    private final String mDisplayName;
    private final String mEnvironment;

    private PremiumPageEnvironment(String str, String str2) {
        this.mDisplayName = str;
        this.mEnvironment = str2;
    }

    public String d() {
        return this.mEnvironment;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.mDisplayName;
    }
}
